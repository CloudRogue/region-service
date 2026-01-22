package com.example.region_service.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegionsSigunguMeta {

    private final String cityCode;
    private final String version;
    private final int totalElements;

    public static RegionsSigunguMeta of(String cityCode, String version, int total) {
        return new RegionsSigunguMeta(cityCode, version, total);
    }
}