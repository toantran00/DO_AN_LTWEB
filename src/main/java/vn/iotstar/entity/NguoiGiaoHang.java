package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NguoiGiaoHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NguoiGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNguoiGiaoHang")
    private Integer maNguoiGiaoHang;

    @Column(name = "TenNguoiGiaoHang", length = 100)
    private String tenNguoiGiaoHang;

    @Column(name = "SĐTNguoiGiaoHang", length = 100)
    private String sdtNguoiGiaoHang;

    @Column(name = "DiaChiNguoiGiaoHang", length = 255)
    private String diaChiNguoiGiaoHang;

    @Column(name = "TrangThai")
    private Boolean trangThai;

    @OneToMany(mappedBy = "nguoiGiaoHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DatHang> datHangs = new ArrayList<>();
}