package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VaiTro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VaiTro {
    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "MaVaiTro", length = 50)
    private MaVaiTro maVaiTro;

    @Column(name = "TenVaiTro", length = 255)
    private String tenVaiTro;

    public enum MaVaiTro {
        GUEST, USER, VENDOR, SHIPPER, ADMIN
    }
}