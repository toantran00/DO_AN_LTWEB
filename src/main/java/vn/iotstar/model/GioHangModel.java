package vn.iotstar.model;

import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GioHangModel {
    private Integer maGioHang;
    private Integer maNguoiDung;
    private String tenNguoiDung;
    private List<GioHangItem> items;
    private BigDecimal tongTien;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class GioHangItem {
        private Integer maSanPham;
        private String tenSanPham;
        private BigDecimal giaBan;
        private Integer soLuong;
        private String hinhAnh;
        private BigDecimal thanhTien;
    }
}