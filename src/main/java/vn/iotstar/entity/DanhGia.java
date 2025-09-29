package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "DanhGia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDanhGia")
    private Integer maDanhGia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNguoiDung")
    private NguoiDung nguoiDung;

    @Column(name = "SoSao")
    private Integer soSao;

    @Column(name = "BinhLuan", columnDefinition = "NVARCHAR(MAX)")
    private String binhLuan;

    @Column(name = "NgayDanhGia")
    private LocalDateTime ngayDanhGia;
}