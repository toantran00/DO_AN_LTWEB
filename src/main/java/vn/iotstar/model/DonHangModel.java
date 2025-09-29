package vn.iotstar.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonHangModel {
    private Integer maDonHang;
    private Integer maNguoiDung;
    private String tenNguoiDung;
    private String sdtNhanHang;
    private String diaChiGiaoHang;
    private BigDecimal tongTien;
    private String trangThai;
    private LocalDateTime ngayDat;
    private List<DonHangItem> items;
    private ThanhToanInfo thanhToan;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DonHangItem {
        private Integer maSanPham;
        private String tenSanPham;
        private Integer soLuong;
        private BigDecimal giaBan;
        private BigDecimal thanhTien;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ThanhToanInfo {
        private String phuongThuc;
        private BigDecimal soTien;
        private String trangThaiThanhToan;
        private LocalDateTime ngayThanhToan;
    }
}