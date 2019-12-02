/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import Dao.nhanviendao;
import bean.nhanvienbean;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NHI
 */
public class nhanvienbo {
    ArrayList<nhanvienbean> ds;
    nhanviendao dao = new nhanviendao();
    
    public ArrayList<nhanvienbean> getnhanvien() throws Exception{
        ds = dao.getnhanvien();
        return ds;
    }
    public int Them(String manv, String hoten, boolean gioitinh, Date ngaysinh, Double hsl, String madv, String mk) throws Exception{
        for (nhanvienbean l: ds){
            if (l.getManv().equals(manv)) return 0;
        }
        nhanvienbean nv = new nhanvienbean(manv, hoten, gioitinh, ngaysinh, hsl, madv, mk);
        ds.add(nv);
        return dao.Them(manv, hoten, gioitinh, ngaysinh, hsl, madv, mk);
    }
    public int Sua(String manv, String hoten, boolean gioitinh, Date ngaysinh, Double hsl, String madv, String mk) throws Exception{
        for (nhanvienbean l: ds){
            if (l.getManv().equals(manv)){
                l.setHoten(hoten);
                l.setGioitinh(gioitinh);
                l.setNgaysinh(ngaysinh);
                l.setHsl(hsl);
                l.setMadv(madv);
                l.setmk(mk);
                return dao.Sua(manv, hoten, gioitinh, ngaysinh, hsl, madv, mk);
            }
        }
        return 0;
    }
    public int Xoa(String manv) throws Exception{
        for (nhanvienbean l: ds){
            if (l.getManv().equals(manv)){
                ds.remove(l);
                return dao.Xoa(manv);
            }
        }
        return 0;
    }
}
