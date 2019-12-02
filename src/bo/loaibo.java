/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import Dao.CoSo;
import Dao.loaidao;
import bean.loaibean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class loaibo {
    ArrayList<loaibean> ds;
    loaidao dao = new loaidao();
    
    public ArrayList<loaibean> getloai() throws Exception{
        ds=dao.getloai();
        return ds;
    }
    public int Them(String maloai, String tenloai) throws Exception{
        //kiem tra trung ma
        for (loaibean l: ds)
            if (l.getMaloai().equals(maloai)) return 0;
        loaibean loai = new loaibean(maloai, tenloai);
        // them vao bo nho
        ds.add(loai);
        //them vao csdl
        return dao.Them(maloai, tenloai);
    }
    public int Sua(String maloai, String tenloai) throws Exception{
        for (loaibean l: ds)
            if (l.getMaloai().equals(maloai)){
                l.setTenloai(tenloai);//sua trong bo nho
                return dao.Sua(maloai, tenloai);//sua trong csdl
            }
        return 0;
    }
    public int Xoa(String maloai) throws Exception{
        for (loaibean l: ds){
            if (l.getMaloai().equals(maloai)){
                ds.remove(l);//xoa trong bo nho
                return dao.Xoa(maloai);//xoa trong csdl
            }
        }
        return 0;
    }
}
