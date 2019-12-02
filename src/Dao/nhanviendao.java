/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.nhanvienbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NHI
 */
public class nhanviendao {

    CoSo cs = new CoSo();

    public ArrayList<nhanvienbean> getnhanvien() throws Exception {
        ArrayList<nhanvienbean> ds = new ArrayList<nhanvienbean>();
        ResultSet rs = cs.getbang("nhanvien");
        while (rs.next()) {
            String manv = rs.getString("manv");
            String hoten = rs.getString("hoten");
            Boolean gioitinh = rs.getBoolean("gioitinh");
            Date ngaysinh = rs.getDate("ngaysinh");
            Double hsl = rs.getDouble("hsl");
            String madv = rs.getString("madv");
            String mk = rs.getString("mk");

            nhanvienbean loai = new nhanvienbean(manv, hoten, gioitinh, ngaysinh, hsl, madv, mk);
            ds.add(loai);
        }
        rs.close();
        return ds;
    }
    public int Them(String manv, String hoten, boolean gioitinh, Date ngaysinh, Double hsl, String madv, String mk) throws Exception{
        String sql="insert into nhanvien values(?,?,?,?,?,?,?)";
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
        cmd.setString(1, manv);
        cmd.setString(2, hoten);
        cmd.setBoolean(3, gioitinh);
        // doi ngay util sang ngay sql
        cmd.setDate(4, new java.sql.Date(ngaysinh.getTime()));
        cmd.setDouble(5, hsl);
        cmd.setString(6, madv);
        cmd.setString(7, mk);
        return cmd.executeUpdate();
    }
    public int Sua(String manv, String hoten, boolean gioitinh, Date ngaysinh, Double hsl, String madv, String mk) throws Exception{
        String sql="update nhanvien set hoten=? gioitinh=? ngaysinh=? hsl=? madv=? mk=? where manv=?";
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
        cmd.setString(6, manv);
        cmd.setString(1, hoten);
        cmd.setBoolean(2, gioitinh);
        // doi ngay util sang ngay sql
        cmd.setDate(3, new java.sql.Date(ngaysinh.getTime()));
        cmd.setDouble(4, hsl);
        cmd.setString(5, madv);
        cmd.setString(6, mk);
        return cmd.executeUpdate();
    }
    public int Xoa(String manv) throws Exception{
        String sql="delete from nhanvien where manv=?";
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
        cmd.setString(1, manv);
        return cmd.executeUpdate();
    }
    
}
