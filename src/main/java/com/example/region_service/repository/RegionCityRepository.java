package com.example.region_service.repository;

import com.example.region_service.domain.RegionCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionCityRepository extends JpaRepository<RegionCity, String> {

    // 시도 목록 정렬해서 반환
    List<RegionCity> findAllByOrderByCityCodeAsc();
}
