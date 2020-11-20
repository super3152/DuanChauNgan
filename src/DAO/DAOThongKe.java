/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTOThongke;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author KMB1604
 */
public class DAOThongKe {
     public static ResultSet LayThongKeSanPhamBanChay() {

        String query = "SELECT sanpham.idsanpham,sanpham.tensanpham,nhacungcap.tennhacungcap,SUM(chitiethoadon.soluong),SUM(chitiethoadon.thanhtien) FROM hoadon INNER JOIN chitiethoadon ON hoadon.idhoadon = chitiethoadon.idhoadon INNER JOIN sanpham ON sanpham.idsanpham = chitiethoadon.idsanpham INNER JOIN chitietphieunhap ON sanpham.idsanpham = chitietphieunhap.idsanpham INNER JOIN phieunhap ON phieunhap.idphieunhap = chitietphieunhap.idphieunhap INNER JOIN nhacungcap ON nhacungcap.idnhacungcap = phieunhap.idnhacungcap GROUP BY sanpham.idsanpham ORDER BY SUM(chitiethoadon.soluong) DESC";
        ResultSet rs = DBConection.GetData(query);
        return rs;
    }
      public static ResultSet LayThongKeSanPham(String tukhoa) {

        String query = "SELECT sanpham.idsanpham,sanpham.tensanpham,nhacungcap.tennhacungcap,SUM(chitiethoadon.soluong),SUM(chitiethoadon.thanhtien) FROM hoadon INNER JOIN chitiethoadon ON hoadon.idhoadon = chitiethoadon.idhoadon INNER JOIN sanpham ON sanpham.idsanpham = chitiethoadon.idsanpham INNER JOIN chitietphieunhap ON sanpham.idsanpham = chitietphieunhap.idsanpham INNER JOIN phieunhap ON phieunhap.idphieunhap = chitietphieunhap.idphieunhap INNER JOIN nhacungcap ON nhacungcap.idnhacungcap = phieunhap.idnhacungcap where sanpham.idsanpham like '%" + tukhoa + "%' or sanpham.tensanpham like '%" + tukhoa + "%' or nhacungcap.tennhacungcap like '%" + tukhoa + "%' GROUP BY sanpham.idsanpham";
        ResultSet rs = DBConection.GetData(query);
        return rs;
    }
     
      public static ResultSet TimKiemSanPhamTheoNgay(String ngaybatdau, String ngayketthuc) {

        String query = "SELECT sanpham.idsanpham,sanpham.tensanpham,nhacungcap.tennhacungcap,SUM(chitiethoadon.soluong),SUM(chitiethoadon.thanhtien) FROM hoadon INNER JOIN chitiethoadon ON hoadon.idhoadon = chitiethoadon.idhoadon INNER JOIN sanpham ON sanpham.idsanpham = chitiethoadon.idsanpham INNER JOIN chitietphieunhap ON sanpham.idsanpham = chitietphieunhap.idsanpham INNER JOIN phieunhap ON phieunhap.idphieunhap = chitietphieunhap.idphieunhap INNER JOIN nhacungcap ON nhacungcap.idnhacungcap = phieunhap.idnhacungcap WHERE hoadon.ngaytaohoadon >= '"+ ngaybatdau +"' and hoadon.ngaytaohoadon <= '"+ ngayketthuc +"' GROUP BY sanpham.idsanpham";
        ResultSet rs = DBConection.GetData(query);
        return rs;
    }
        public static ResultSet LayThongKeHoaDon() {

        String query = "SELECT idhoadon,sohoadon,ngaytaohoadon,nguoidung.tennguoidung,congno,tongtien FROM hoadon INNER JOIN nguoidung ON nguoidung.idnguoidung = hoadon.idnguoidung";
        ResultSet rs = DBConection.GetData(query);
        return rs;
    }
        
             public static ResultSet LayThongPhieuNhap() {

        String query = "SELECT idphieunhap, sophieunhap, ngaynhap, congno,  thanhtien FROM phieunhap";
        ResultSet rs = DBConection.GetData(query);
        return rs;
    }
      
}
