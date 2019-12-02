/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrmi;

import bean.loaibean;
import bean.nhanvienbean;
import java.rmi.*;
import java.util.ArrayList;

/**
 *
 * @author NHI
 */
public interface ITinhToan extends Remote{
    public int nhan(int a, int b) throws Exception;
    public int cong(int a, int b) throws Exception;
    public int tru(int a, int b) throws Exception;
    public ArrayList<loaibean> getloai() throws RemoteException;
    public ArrayList<nhanvienbean> getnv() throws RemoteException;
}
