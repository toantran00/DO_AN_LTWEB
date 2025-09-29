package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MatHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaMatHang")
    private Integer maMatHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaGioHang")
    private GioHang gioHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;

    @Column(name = "SoLuongDat")
    private Integer soLuongDat;
}