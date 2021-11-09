package clase_03_303;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ProcesoEscuchar extends Thread{
    public Socket refC = null;
    public InputStream entrada = null;
    public DataInputStream entra = null;
    public ProcesoEscuchar sig = null;
    
    public void imprimir(){
        try{
            if(refC!=null){
                System.out.println(refC.toString());
            }            
        }
        catch(Exception e){
        }
    }
    
    public ProcesoEscuchar(Socket refS){
        try{
            refC = refS;
            entrada = refC.getInputStream();
            entra = new DataInputStream(entrada);
        }
        catch(Exception e){
        }        
    }
    

    public void run(){
        while(true){
            try{
                String leido = entra.readUTF();
                System.out.println(leido);
            }
            catch(Exception e1){                
            }
        }        
    }    
}
