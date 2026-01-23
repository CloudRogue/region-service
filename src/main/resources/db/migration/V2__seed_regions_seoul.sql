-- meta
INSERT INTO region_meta (meta_key, meta_value)
VALUES ('version', '2026-01-07') AS new
ON DUPLICATE KEY UPDATE meta_value = new.meta_value;

-- city: 서울
INSERT INTO region_city (city_code, city_name)
VALUES ('11', '서울특별시') AS new
ON DUPLICATE KEY UPDATE city_name = new.city_name;

-- sigungu: 25개
INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11110','종로구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11140','중구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11170','용산구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11200','성동구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11215','광진구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11230','동대문구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11260','중랑구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11290','성북구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11305','강북구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11320','도봉구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11350','노원구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11380','은평구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11410','서대문구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11440','마포구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11470','양천구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11500','강서구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11530','구로구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11545','금천구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11560','영등포구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11590','동작구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11620','관악구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11650','서초구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11680','강남구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11710','송파구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;

INSERT INTO region_sigungu (sigungu_code, sigungu_name, city_code)
VALUES ('11740','강동구','11') AS new
ON DUPLICATE KEY UPDATE sigungu_name = new.sigungu_name, city_code = new.city_code;