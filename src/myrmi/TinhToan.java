/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrmi;

import Dao.loaidao;
import Dao.nhanviendao;
import bean.loaibean;
import bean.nhanvienbean;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NHI
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    
    public TinhToan() throws RemoteException{};

    @Override
    public int nhan(int a, int b) throws Exception {
        int s = a * b;
        System.out.println("Tich: " + s);
        return s;
    }

    @Override
    public int cong(int a, int b) throws Exception {
        int s = a + b;
        System.out.println("Tong: " + s);
        return s;
    }

    @Override
    public int tru(int a, int b) throws Exception {
        int s = a - b;
        System.out.println("Hieu: " + s);
        return s;
    }

    ArrayList<loaibean> dsl;
    loaidao ldao = new loaidao();
    
    @Override
    public ArrayList<loaibean> getloai() throws RemoteException {
        try {
            dsl=ldao.getloai();
        } catch (Exception ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsl;
    }

    ArrayList<nhanvienbean> dsnv;
    nhanviendao nvdao = new nhanviendao();
    
    @Override
    public ArrayList<nhanvienbean> getnv() throws RemoteException {
        try {
            dsnv = nvdao.getnhanvien();
        } catch (Exception ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
    }
    
}
