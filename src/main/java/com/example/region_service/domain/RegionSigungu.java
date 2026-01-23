package com.example.region_service.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "region_sigungu",
        indexes = {
                @Index(name = "idx_sigungu_city_code", columnList = "city_code")
        }
)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RegionSigungu {

    @Id
    @Column(name = "sigungu_code", length = 5, nullable = false)
    private String sigunguCode;

    @Column(name = "sigungu_name", nullable = false)
    private String sigunguName;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_code", nullable = false)
    private RegionCity city;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public static RegionSigungu create(String sigunguCode, String sigunguName, RegionCity city) {
        RegionSigungu s = new RegionSigungu();
        s.sigunguCode = sigunguCode;
        s.sigunguName = sigunguName;
        s.city = city;
        return s;
    }
}
