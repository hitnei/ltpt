/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package myrmi;

/**
 *
 * @author NHI
 */
public class TinhToan implements ITinhToan{

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
    
}
