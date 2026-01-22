package com.example.region_service.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CityItem {

    private final String cityCode;
    private final String cityName;

    public static CityItem of(String code, String name) {
        return new CityItem(code, name);
    }
}