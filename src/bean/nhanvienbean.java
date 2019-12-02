/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author NHI
 */
public class nhanvienbean implements Serializable{

    public nhanvienbean(String manv, String hoten, boolean gioitinh, Date ngaysinh, Double hsl, String madv, String mk) {
        this.manv = manv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
        this.madv = madv;
        this.mk = mk;
    }
    
    private String manv;
    private String hoten;
    private boolean gioitinh;
    private Date ngaysinh;
    private Double hsl;
    private String madv;
    private String mk;

    public String getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public Double getHsl() {
        return hsl;
    }

    public String getMadv() {
        return madv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setHsl(Double hsl) {
        this.hsl = hsl;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }
    
    public void setmk(String mk) {
        this.mk = mk;
    }
    
    
    
}
