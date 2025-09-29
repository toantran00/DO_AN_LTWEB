package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GioHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaGioHang")
    private Integer maGioHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNguoiDung")
    private NguoiDung nguoiDung;

    @Column(name = "NgayTao")
    private LocalDateTime ngayTao;

    @OneToMany(mappedBy = "gioHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<MatHang> matHangs = new ArrayList<>();
}