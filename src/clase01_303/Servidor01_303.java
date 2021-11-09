package clase01_303;
// Autor: Luis Felipe Wanumen Silva
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor01_303 {    
    public Servidor01_303(){
        try{
            ServerSocket objSS = new ServerSocket(99);
            int contador = 0;            
            Socket cliente = objSS.accept();
            OutputStream flujoSalida = cliente.getOutputStream();
            DataOutputStream flujoS = new DataOutputStream(flujoSalida);
            flujoS.writeUTF("Hola Lina Marcela");
            flujoS.writeUTF("Como vamos?");
            flujoS.writeUTF("Espero que bien!!");
            
            InputStream flujoEntrada = cliente.getInputStream();
            DataInputStream flujoE = new DataInputStream(flujoEntrada);
            String leidoLoDelCliente = flujoE.readUTF();
            
            flujoS.writeUTF("Se me olvidaba decirte que te extraño");
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Servidor01_303 p = new Servidor01_303();
    }
    
}
