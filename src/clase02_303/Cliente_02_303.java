package clase02_303;
// Autor: Luis Felipe Wanumen Silva
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente_02_303 {
    public Cliente_02_303(){
        try{
            Socket s = new Socket("localhost",99);
            OutputStream salida = s.getOutputStream();
            DataOutputStream sale = new DataOutputStream(salida);
            sale.writeUTF("Yo me llamo Cumbia");            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        Cliente_02_303 p = new Cliente_02_303();
    }    
}
