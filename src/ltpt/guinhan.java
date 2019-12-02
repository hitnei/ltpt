/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltpt;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hoang
 */
public class guinhan {
    ServerSocket s;
    public void MoCong(int cong) throws Exception{
        s = new ServerSocket(cong);
    }
//    public String Nhan() throws Exception{
//        s.accept();
//        System.out.println("da co 1 client noi den");
//        return null;
//    } 
    public String Nhan() throws Exception{
        Socket c = s.accept();
        System.out.println("da co 1 client noi den");        
        InputStreamReader is = new InputStreamReader(c.getInputStream());
        BufferedReader r = new BufferedReader(is);
        return r.readLine();
    }
    public void Gui(String ip, String mess, int cong) throws Exception{
        Socket ss = new Socket(ip, cong); // noi len sv
        System.out.println("da noi den server");
        DataOutputStream out = new DataOutputStream(ss.getOutputStream());
        out.writeBytes(mess);
        out.write(13);
        out.write(10);
        out.close();
        ss.close();
    }

    void Gui(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
