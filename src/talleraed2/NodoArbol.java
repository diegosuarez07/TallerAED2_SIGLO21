
package talleraed2;


public class NodoArbol {
    
    private int info; 
    private NodoArbol izq; 
    private NodoArbol der; 

    public NodoArbol(int info, NodoArbol izq, NodoArbol der) {
        this.info = info;
        this.izq = izq;
        this.der = der; 
        
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
    
    
    
    
    
    
}
