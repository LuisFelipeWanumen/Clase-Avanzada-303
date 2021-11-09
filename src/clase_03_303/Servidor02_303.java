package clase_03_303;
// Autor: Luis Felipe Wanumen Silva
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Servidor02_303 {
    public static ListaSE objListaSE = new ListaSE();
    public static ProcesoAtender objProcesoAtender = null;
    
    public Servidor02_303() {
        try {
            objProcesoAtender = new ProcesoAtender();            
            objProcesoAtender.start();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        JFrame frame = new JFrame("JFrame Example");  
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);    
        JPanel arriba = new JPanel();
        arriba.setBackground(Color.yellow);        
        JPanel centro = new JPanel();
        centro.setBackground(Color.blue);        
        JPanel abajo = new JPanel();
        abajo.setBackground(Color.red);
        
        
    }

    public static void main(String[] args) {
        Servidor02_303 p = new Servidor02_303();
    }

}
