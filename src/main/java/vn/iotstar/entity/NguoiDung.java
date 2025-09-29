package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NguoiDung")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNguoiDung")
    private Integer maNguoiDung;

    @Column(name = "TenNguoiDung", length = 100)
    private String tenNguoiDung;

    @Column(name = "Email", unique = true, length = 100)
    private String email;

    @Column(name = "MatKhau", length = 255)
    private String matKhau;

    @Column(name = "SDT", length = 20)
    private String sdt;

    @Column(name = "DiaChi", length = 255)
    private String diaChi;

    @Enumerated(EnumType.STRING)
    @Column(name = "MaVaiTro", length = 50)
    private VaiTro.MaVaiTro maVaiTro;

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<GioHang> gioHangs = new ArrayList<>();

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DatHang> datHangs = new ArrayList<>();

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DanhGia> danhGias = new ArrayList<>();

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<KhuyenMai> khuyenMais = new ArrayList<>();
}