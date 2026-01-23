package com.example.region_service.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SigunguItem {

    private final String sigunguCode; // 5자리 코드
    private final String sigunguName;

    public static SigunguItem of(String code, String name) {
        return new SigunguItem(code, name);
    }
}
