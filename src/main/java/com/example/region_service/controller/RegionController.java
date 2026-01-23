package com.example.region_service.controller;

import com.example.region_service.api.*;
import com.example.region_service.service.RegionQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/regions")
public class RegionController {

    private final RegionQueryService regionQueryService;


    //시 목록 조회
    @GetMapping("/cities")
    public ResponseEntity<RegionsResponse<CityItem, RegionsCitiesMeta>> getCities() {
        return ResponseEntity.ok(regionQueryService.getCities());
    }

    //시군구 목록 조회
    @GetMapping("/sigungu")
    public ResponseEntity<RegionsResponse<SigunguItem, RegionsSigunguMeta>> getSigungu(
            @RequestParam String cityCode
    ) {
        return ResponseEntity.ok(regionQueryService.getSigungu(cityCode));
    }

}
