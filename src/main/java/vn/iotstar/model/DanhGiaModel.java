package vn.iotstar.model;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DanhGiaModel {
    private Integer maDanhGia;
    private Integer maSanPham;
    private String tenSanPham;
    private Integer maNguoiDung;
    private String tenNguoiDung;
    private Integer soSao;
    private String binhLuan;
    private LocalDateTime ngayDanhGia;
}