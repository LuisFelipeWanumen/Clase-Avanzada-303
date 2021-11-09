package clase02_303;
// Autor: Luis Felipe Wanumen Silva
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor02_303 {
    public Servidor02_303() {
        try {
            ServerSocket objSS = new ServerSocket(99);
            while (true) {
                Socket clienteN = objSS.accept();
                ProcesoEscuchar peN = new ProcesoEscuchar(clienteN);
                peN.start();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Servidor02_303 p = new Servidor02_303();
    }

}
