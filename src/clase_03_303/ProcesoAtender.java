package clase_03_303;
import java.net.ServerSocket;
import java.net.Socket;
public class ProcesoAtender extends Thread{    
    public void run() {
        try {
            ServerSocket objSS = new ServerSocket(99);
            while (true) {
                Socket clienteN = objSS.accept();
                ProcesoEscuchar peN = new ProcesoEscuchar(clienteN);
                peN.start();
                Servidor02_303.objListaSE.anadirProceso(peN);
                Servidor02_303.objListaSE.imprimir();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
