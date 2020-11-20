/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBaoCanhBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KMB1604
 */
public class BLLThongke {
     public static void HienThiThongKeSanPham(JTable tbl, String tukhoa) {
        ResultSet rs = DAO.DAOThongKe.LayThongKeSanPham(tukhoa);
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getInt(4);
                obj[4] = rs.getDouble(5);
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBaoCanhBao.ThongBao("Lỗi đổ dữ liệu từ bảng thống kê sản phẩm", "Thông báo");
        }

    }
     
      public static void HienThiThongKeHoaDon(JTable tbl) {
        ResultSet rs = DAO.DAOThongKe.LayThongKeHoaDon();
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getDate(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getDouble(5);
                obj[5] = rs.getDouble(6);
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBaoCanhBao.ThongBao("Lỗi đổ dữ liệu từ bảng thống kê sản phẩm", "Thông báo");
        }

    }
     
      public static void HienThiThongKeSanPhamBanChay(JTable tbl) {
        ResultSet rs = DAO.DAOThongKe.LayThongKeSanPhamBanChay();
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getInt(4);
                obj[4] = rs.getDouble(5);
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBaoCanhBao.ThongBao("Lỗi đổ dữ liệu từ bảng thống kê sản phẩm", "Thông báo");
        }

    }
      
      
       public static void HienThiThongKeSanPhamTheoNgay(JTable tbl, String ngaybatdau, String ngayketthuc) {
        ResultSet rs = DAO.DAOThongKe.TimKiemSanPhamTheoNgay(ngaybatdau, ngayketthuc);
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getInt(4);
                obj[4] = rs.getDouble(5);
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBaoCanhBao.ThongBao("Lỗi đổ dữ liệu từ bảng thống kê sản phẩm", "Thông báo");
        }

    }
       
       
          public static void HienThiThongKePhieuNhap(JTable tbl) {
        ResultSet rs = DAO.DAOThongKe.LayThongPhieuNhap();
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getDate(3);
                obj[3] = rs.getDouble(4);
                obj[4] = rs.getDouble(5);
              
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBaoCanhBao.ThongBao("Lỗi đổ dữ liệu từ bảng thống kê sản phẩm", "Thông báo");
        }

    }
}
