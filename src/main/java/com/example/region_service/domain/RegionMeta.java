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
@Table(name = "region_meta")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RegionMeta {

    @Id
    @Column(name = "meta_key", length = 50, nullable = false)
    private String metaKey; // 메타키

    @Column(name = "meta_value", length = 200, nullable = false)
    private String metaValue; // 메타 값

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // 정적메서드
    public static RegionMeta of(String key, String value) {
        RegionMeta m = new RegionMeta();
        m.metaKey = key;
        m.metaValue = value;
        return m;
    }

}
