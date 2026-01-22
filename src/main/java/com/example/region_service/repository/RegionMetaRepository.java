package com.example.region_service.repository;

import com.example.region_service.domain.RegionMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionMetaRepository extends JpaRepository<RegionMeta, String> {
}