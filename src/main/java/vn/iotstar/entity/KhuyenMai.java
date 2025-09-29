package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "KhuyenMai")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhuyenMai")
    private Integer maKhuyenMai;

    @Column(name = "MaGiamGia", length = 50)
    private String maGiamGia;

    @Column(name = "Discount", precision = 5, scale = 2)
    private BigDecimal discount;

    @Column(name = "NgayBatDau")
    private LocalDateTime ngayBatDau;

    @Column(name = "NgayKetThuc")
    private LocalDateTime ngayKetThuc;

    @Column(name = "SoLuongMaGiamGia")
    private Integer soLuongMaGiamGia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNguoiDung")
    private NguoiDung nguoiDung;
}