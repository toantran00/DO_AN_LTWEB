package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ThanhToan")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaThanhToan")
    private Integer maThanhToan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaDatHang")
    private DatHang datHang;

    @Enumerated(EnumType.STRING)
    @Column(name = "PhuongThuc", length = 50)
    private PhuongThucThanhToan phuongThuc;

    @Column(name = "SoTienThanhToan", precision = 18, scale = 2)
    private BigDecimal soTienThanhToan;

    @Column(name = "NgayThanhToan")
    private LocalDateTime ngayThanhToan;

    @Enumerated(EnumType.STRING)
    @Column(name = "TrangThai", length = 50)
    private TrangThaiThanhToan trangThai;

    public enum PhuongThucThanhToan {
        COD, VNPAY, MOMO
    }

    public enum TrangThaiThanhToan {
        Pending, Success, Failed
    }
}