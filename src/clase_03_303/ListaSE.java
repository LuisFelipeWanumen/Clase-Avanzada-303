package clase_03_303;

public class ListaSE {
    public ProcesoEscuchar nodoRaiz = null;
    public ProcesoEscuchar nodoFinal = null;
    
    public void anadirProceso(ProcesoEscuchar nodin){
        if(nodoRaiz==null){
            nodoRaiz = nodin;
            nodoFinal = nodin;
        }
        else{
            nodoFinal.sig = nodin;
            nodoFinal = nodin;
        }
    }
    
    public void imprimir(){
        ProcesoEscuchar nodoRecorrer = null;
        nodoRecorrer = nodoRaiz;
        while(nodoRecorrer!=null){
            nodoRecorrer.imprimir();
            nodoRecorrer = nodoRecorrer.sig;
        }        
    }
    
}
