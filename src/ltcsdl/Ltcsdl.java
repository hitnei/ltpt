/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltcsdl;

import Dao.CoSo;

/**
 *
 * @author hoang
 */
public class Ltcsdl {
    public static void main(String args[]) throws Exception {
        CoSo cs = new CoSo();
        
        cs.KetNoi("LAPTOP-NDSDAF0D", "master", "sa", "123");
    }
}
