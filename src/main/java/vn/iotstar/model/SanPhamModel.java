package vn.iotstar.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SanPhamModel {
    private Integer maSanPham;
    private String tenSanPham;
    private String moTa;
    private BigDecimal giaBan;
    private Integer soLuongConLai;
    private String hinhAnh;
    private Boolean trangThai;
    private String tenDanhMuc;
    private Integer maDanhMuc;
    private String loaiSanPham;
    private LocalDate ngayNhap;
    
    // Thuộc tính cho thú cưng
    private String gioiTinh;
    private Integer doTuoi;
    private String sucKhoe;
}