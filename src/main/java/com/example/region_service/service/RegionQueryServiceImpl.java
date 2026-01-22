package com.example.region_service.service;

import com.example.region_service.api.*;
import com.example.region_service.domain.RegionCity;
import com.example.region_service.domain.RegionMeta;
import com.example.region_service.domain.RegionSigungu;
import com.example.region_service.exception.BusinessException;
import com.example.region_service.exception.ErrorCode;
import com.example.region_service.repository.RegionCityRepository;
import com.example.region_service.repository.RegionMetaRepository;
import com.example.region_service.repository.RegionSigunguRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RegionQueryServiceImpl implements RegionQueryService {

    private static final String META_KEY_VERSION = "version"; // region_meta에서 버전 조회할 키

    private final RegionCityRepository cityRepository;
    private final RegionSigunguRepository sigunguRepository;
    private final RegionMetaRepository metaRepository;

    @Override
    public RegionsResponse<CityItem, RegionsCitiesMeta> getCities() {
        // 도시 목록 조회
        List<RegionCity> cities = cityRepository.findAllByOrderByCityCodeAsc();

        // dto 변환
        List<CityItem> data = cities.stream()
                .map(c -> CityItem.of(c.getCityCode(), c.getCityName()))
                .toList();

        // 버전 조회하기
        String version = getRequiredVersion();


        RegionsCitiesMeta meta = RegionsCitiesMeta.of(version, data.size());

        return new RegionsResponse<>(data, meta);
    }

    @Override
    public RegionsResponse<SigunguItem, RegionsSigunguMeta> getSigungu(String cityCode) {
        // 도시코드 검증
        String normalizedCityCode = normalizeCityCode(cityCode);

        // 군구조회
        List<RegionSigungu> list = sigunguRepository.findAllByCity_CityCodeOrderBySigunguCodeAsc(normalizedCityCode);


        List<SigunguItem> data = list.stream()
                .map(s -> SigunguItem.of(s.getSigunguCode(), s.getSigunguName()))
                .toList();

        // 버전 조회
        String version = getRequiredVersion();


        RegionsSigunguMeta meta = RegionsSigunguMeta.of(normalizedCityCode, version, data.size());

        return new RegionsResponse<>(data, meta);
    }

    // 버전조회
    private String getRequiredVersion() {
        RegionMeta meta = metaRepository.findById(META_KEY_VERSION)
                .orElseThrow(() -> new BusinessException(
                        ErrorCode.INTERNAL_ERROR,
                        "region_meta에 version이 없습니다. (meta_key='version')"
                ));
        String v = meta.getMetaValue();
        if (v == null || v.isBlank()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "region_meta version 값이 비어있습니다.");
        }
        return v.trim();
    }

    //도시코드 정규화 및 검증
    private String normalizeCityCode(String cityCode) {
        if (cityCode == null) {
            throw new BusinessException(ErrorCode.INVALID_REQUEST, "cityCode는 필수입니다.");
        }
        String trimmed = cityCode.trim();
        if (!trimmed.matches("^[0-9]{2}$")) {
            throw new BusinessException(ErrorCode.INVALID_REQUEST, "cityCode 형식이 올바르지 않습니다. (예: 11)");
        }
        return trimmed;
    }
}
