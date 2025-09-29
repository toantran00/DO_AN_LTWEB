package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DatHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DatHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDatHang")
    private Integer maDatHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNguoiDung")
    private NguoiDung nguoiDung;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNguoiGiaoHang")
    private NguoiGiaoHang nguoiGiaoHang;

    @Column(name = "NgayDat")
    private LocalDateTime ngayDat;

    @Column(name = "TongTien", precision = 18, scale = 2)
    private BigDecimal tongTien;

    @Enumerated(EnumType.STRING)
    @Column(name = "TrangThai", length = 50)
    private TrangThaiDonHang trangThai;

    @OneToMany(mappedBy = "datHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DatHangChiTiet> datHangChiTiets = new ArrayList<>();

    @OneToMany(mappedBy = "datHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<ThanhToan> thanhToans = new ArrayList<>();

    public enum TrangThaiDonHang {
        New, Confirmed, Delivered, Cancelled, Refunded
    }
}