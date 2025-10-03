package vn.iotstar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VaiTro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VaiTro {
    @Id
    @NotBlank(message = "Mã vai trò không được để trống")
    @Column(name = "MaVaiTro", columnDefinition = "NVARCHAR(255)")
    private String maVaiTro;
    
    @NotBlank(message = "Tên vai trò không được để trống")
    @Column(name = "TenVaiTro", nullable = false, columnDefinition = "NVARCHAR(255)")
    private String tenVaiTro;
}