package vn.iotstar.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KhuyenMaiModel {
    private Integer maKhuyenMai;
    private String maGiamGia;
    private BigDecimal discount;
    private LocalDateTime ngayBatDau;
    private LocalDateTime ngayKetThuc;
    private Integer soLuongMa;
    private Boolean conHieuLuc;
}