package vn.iotstar.model;

import lombok.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThongKeModel {
    private BigDecimal tongDoanhThu;
    private Integer tongDonHang;
    private Integer tongSanPham;
    private Integer tongNguoiDung;
    private Integer donHangMoi;
}