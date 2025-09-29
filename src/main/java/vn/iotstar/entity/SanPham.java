package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SanPham")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSanPham")
    private Integer maSanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaDanhMuc", nullable = false)
    private DanhMuc danhMuc;

    @Column(name = "TenSanPham", nullable = false, length = 255)
    private String tenSanPham;

    @Column(name = "MoTaSanPham", columnDefinition = "NVARCHAR(MAX)")
    private String moTaSanPham;

    @Column(name = "GiaBan", nullable = false, precision = 18, scale = 2)
    private BigDecimal giaBan;

    @Column(name = "SoLuongConLai", nullable = false)
    private Integer soLuongConLai;

    @Column(name = "NgayNhap")
    private LocalDate ngayNhap;

    @Column(name = "HinhAnh", length = 255)
    private String hinhAnh;

    @Column(name = "LoaiSanPham", length = 255)
    private String loaiSanPham;

    @Column(name = "TrangThai")
    private Boolean trangThai;

    @OneToOne(mappedBy = "sanPham", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ThuCung thuCung;

    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<MatHang> matHangs = new ArrayList<>();

    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DatHangChiTiet> datHangChiTiets = new ArrayList<>();

    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DanhGia> danhGias = new ArrayList<>();
}