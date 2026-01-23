package com.example.region_service.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class RegionsResponse<T, M> {

    private final List<T> data;
    private final M meta;
}