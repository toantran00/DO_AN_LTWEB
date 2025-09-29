package vn.iotstar.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthModel {
    private String email;
    private String matKhau;
    private String tenNguoiDung;
    private String sdt;
    private String diaChi;
}