package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "DatHangChiTiet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DatHangChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDatHangChiTiet")
    private Integer maDatHangChiTiet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaDatHang")
    private DatHang datHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "GiaBan", precision = 18, scale = 2)
    private BigDecimal giaBan;

    @Column(name = "ThanhTien", precision = 18, scale = 2)
    private BigDecimal thanhTien;
}