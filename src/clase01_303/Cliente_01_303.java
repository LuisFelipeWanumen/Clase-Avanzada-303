package clase01_303;
// Autor: Luis Felipe Wanumen Silva
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente_01_303 {
    public Cliente_01_303(){
        try{
            Socket objSC = new Socket("localhost", 99);
            InputStream flujoEntrada = objSC.getInputStream();
            DataInputStream flujoD = new DataInputStream(flujoEntrada);
            // OutputStream flujoSalida = objSC.getOutputStream();
            while(true){
                String leido = flujoD.readUTF();
                System.out.println("El servidor dijo "+leido);                
            }            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        Cliente_01_303 p = new Cliente_01_303();
    }    
}
