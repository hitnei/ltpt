/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package myrmi;

import java.rmi.Naming;

/**
 *
 * @author NHI
 */
public class Client {
    public static void main(String[] args) {
    try{
    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://172.16.0.177/TinhToan");
    System.out.print(tt.cong(10,20) );
    System.out.print(tt.nhan(15,15) );
//    System.out.print(tt.tru(100,15) );
    }catch(Exception tt) {System.out.print(tt);}
  }

}
