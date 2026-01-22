package com.example.region_service.service;

import com.example.region_service.api.*;

public interface RegionQueryService {

    // 시(시도) 목록 조회
    RegionsResponse<CityItem, RegionsCitiesMeta> getCities();

    // 시군구 목록 조회 (cityCode 기준)
    RegionsResponse<SigunguItem, RegionsSigunguMeta> getSigungu(String cityCode);
}
