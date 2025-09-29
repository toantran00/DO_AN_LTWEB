package vn.iotstar.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NguoiDungModel {
    private Integer maNguoiDung;
    private String tenNguoiDung;
    private String email;
    private String sdt;
    private String diaChi;
    private String vaiTro;
}