/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrmi;

import Dao.CoSo;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author NHI
 */
public class MyServer {
    public static void main(String[] args) {
    try{
        CoSo cs = new CoSo();
        cs.KetNoi("DESKTOP-G6S0UHU", "QLNV", "sa", "123");
        TinhToan tt= new TinhToan();
        LocateRegistry.createRegistry(1099);  
        //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
        //UnicastRemoteObject.exportObject(tt);
        //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
        Naming.bind("rmi://localhost/TinhToan",tt);
        System.out.print("Da cho may khach goi den:");
    }catch(Exception tt)   { System.out.print(tt);    }
  }

}
