package com.example.region_service.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegionsCitiesMeta {

    private final String version;     // 변경감지용
    private final int totalElements;  // 전체 항목 수

    public static RegionsCitiesMeta of(String version, int total) {
        return new RegionsCitiesMeta(version, total);
    }
}