package com.example.region_service.repository;

import com.example.region_service.domain.RegionSigungu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionSigunguRepository extends JpaRepository<RegionSigungu, String> {

    // 특정 시(cityCode)에 속한 시군구를 코드 오름차순으로 조회
    List<RegionSigungu> findAllByCity_CityCodeOrderBySigunguCodeAsc(String cityCode);

    // city 자체 존재 여부 판단을 위해
    boolean existsByCity_CityCode(String cityCode);
}