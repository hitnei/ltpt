/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public class CoSo {
    public static Connection cn, cn2;
    public void KetNoi (String servername, String database, String un, String pass) throws Exception{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Da xac dinh HQLCSDL");
        String url=String.format("jdbc:sqlserver://%s:1433;databaseName=%s;user=%s; password=%s", servername, database, un, pass);
        cn=DriverManager.getConnection(url);
        System.out.println("da ket noi");

    }
    public void KetNoi2 (String servername, String database, String un, String pass) throws Exception{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Da xac dinh HQLCSDL");
        String url=String.format("jdbc:sqlserver://%s:1433;databaseName=%s;user=%s; password=%s", servername, database, un, pass);
        cn2=DriverManager.getConnection(url);
        System.out.println("da ket noi");

    }
    public ResultSet getbang(String tb) throws Exception{
        String sql = "select * from " + tb;
        Statement cmd = cn.createStatement();
        ResultSet rs = cmd.executeQuery(sql);
        return rs;
    }
    public ResultSet getbang2(String tb, Connection cn) throws Exception{
        String sql = "select * from " + tb;
        Statement cmd = cn.createStatement();
        ResultSet rs = cmd.executeQuery(sql);
        return rs;
    }
    public DefaultTableModel NapBang(String tb) throws Exception{
        //tao mo ta hinh bang
        DefaultTableModel mh = new DefaultTableModel();
        //lay dl cua bang tb
        ResultSet rs = getbang(tb);
        //lay mo ta du lieu cua rs
        ResultSetMetaData mt = rs.getMetaData();
        //lay ten cot trong rs -> gan vao DefaultTableModel
        int sc = mt.getColumnCount();//tong so cot
        for (int i=1; i<=sc; i++){
            mh.addColumn(mt.getColumnName(i));
        }
        while(rs.next()){
            Object[] t = new Object[sc];
            for(int j=1; j<=sc; j++){
                t[j-1]=rs.getString(j);
            }
            mh.addRow(t);
        }
        return mh;
    }
    public DefaultTableModel NapBang2(String tb, Connection cn) throws Exception{
        //tao mo ta hinh bang
        DefaultTableModel mh = new DefaultTableModel();
        //lay dl cua bang tb
        ResultSet rs = getbang2(tb, cn);
        //lay mo ta du lieu cua rs
        ResultSetMetaData mt = rs.getMetaData();
        //lay ten cot trong rs -> gan vao DefaultTableModel
        int sc = mt.getColumnCount();//tong so cot
        for (int i=1; i<=sc; i++){
            mh.addColumn(mt.getColumnName(i));
        }
        while(rs.next()){
            Object[] t = new Object[sc];
            for(int j=1; j<=sc; j++){
                t[j-1]=rs.getString(j);
            }
            mh.addRow(t);
        }
        return mh;
    }

    public boolean DangNhap(String manv, String password) throws Exception{
        String sql="select * from nhanvien where manv=? and mk=?";
        PreparedStatement cmd = cn.prepareStatement(sql);
        System.out.println(cmd);
        cmd.setString(1, manv);
        cmd.setString(2, password);
        
        ResultSet rs = cmd.executeQuery();
        
        return rs.next();
    }
}
