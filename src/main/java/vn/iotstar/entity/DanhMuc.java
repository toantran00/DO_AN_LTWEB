package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DanhMuc")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDanhMuc")
    private Integer maDanhMuc;

    @Column(name = "TenDanhMuc", nullable = false, length = 100)
    private String tenDanhMuc;

    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<SanPham> sanPhams = new ArrayList<>();
}