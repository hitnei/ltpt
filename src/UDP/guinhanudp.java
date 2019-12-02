/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author hoang
 */
public class guinhanudp {
    DatagramSocket s;
    public void mocong(int cong) throws Exception {
        s = new DatagramSocket(cong);
        System.out.println("da mo cong " + cong);
    }
    public void Gui(String ip, String tb, int cong) throws Exception{
        DatagramSocket ss = new DatagramSocket();
        byte[] buf = new byte[512];
        //chuyen tu string sang mang cac byte
        buf = tb.getBytes();
        InetAddress address = InetAddress.getByName(ip);
        DatagramPacket p = new DatagramPacket(buf, buf.length, address, cong);
        ss.send(p);
        System.out.println("da gui tb: " + tb);
        ss.close();
    }
    public String Nhan() throws Exception{
        DatagramPacket p = new DatagramPacket(new byte[512], 512);
        s.receive(p);
        String st = new String(p.getData()).trim();
        return st;
//        DatagramSocket dg = new DatagramSocket();
//        byte bodem[] = new byte[512];
//        DatagramPacket dr = new DatagramPacket(buf, length)
//        dg.receive(dr);
//        String st = new String(dr)
    }
    public void GuiFile(String ip, byte[] tb, int cong) throws Exception{
        DatagramSocket ss = new DatagramSocket();
        //chuyen tu string sang mang cac byte
        InetAddress address = InetAddress.getByName(ip);
        DatagramPacket p = new DatagramPacket(tb, tb.length, address, cong);
        ss.send(p);
        System.out.println("da gui tb: " + tb);
        ss.close();
    }
    public byte[] NhanFile() throws Exception{
        DatagramPacket p = new DatagramPacket(new byte[512], 512);
        s.receive(p);
        
        return p.getData();
    }
    
}
