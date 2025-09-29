package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ThuCung")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThuCung {
    @Id
    @Column(name = "MaSanPham")
    private Integer maSanPham;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;

    @Column(name = "GioiTinh", length = 20)
    private String gioiTinh;

    @Column(name = "DoTuoi")
    private Integer doTuoi;

    @Column(name = "SucKhoe", length = 100)
    private String sucKhoe;
}