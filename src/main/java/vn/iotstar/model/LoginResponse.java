package vn.iotstar.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {
    private String token;
    private String loaiToken;
    private NguoiDungModel nguoiDung;
}