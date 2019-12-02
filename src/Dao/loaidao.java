/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.loaibean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class loaidao {
    CoSo cs = new CoSo();
    public ArrayList<loaibean> getloai() throws Exception{
        ResultSet rs = cs.getbang("donvi");
        ArrayList<loaibean> ds = new ArrayList<loaibean>();
        while(rs.next()){
            String maloai=rs.getString("Madv");
            String tenloai=rs.getString("Tendv");
            loaibean loai = new loaibean(maloai, tenloai);
            ds.add(loai);
        }
        rs.close();
        return ds;
    }
    public int Them(String maloai, String tenloai) throws Exception{
        String sql="insert into donvi values(?,?)";
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
        cmd.setString(1, maloai);
        cmd.setString(2, tenloai);
        return cmd.executeUpdate();
    }
    public int Sua(String maloai, String tenloai) throws Exception{
        String sql="update donvi set Tendv=? where Madv=?";
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
        cmd.setString(1, tenloai);
        cmd.setString(2, maloai);
        return cmd.executeUpdate();
    }
    public int Xoa(String maloai) throws Exception{
        String sql="delete from donvi where Madv=?";
//        System.out.println(maloai);
        PreparedStatement cmd = cs.cn.prepareStatement(sql);
//        System.out.println("a");
        cmd.setString(1, maloai);
        return cmd.executeUpdate();
    }
}
