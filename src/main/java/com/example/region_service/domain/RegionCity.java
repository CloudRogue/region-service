package com.example.region_service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "region_city")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RegionCity {

    @Id
    @Column(name = "city_code", nullable = false, length = 2)
    private String cityCode;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


    // 정적 메서드
    public static RegionCity create(String cityCode, String cityName) {
        RegionCity c = new RegionCity();
        c.cityCode = cityCode;
        c.cityName = cityName;
        return c;
    }
}
