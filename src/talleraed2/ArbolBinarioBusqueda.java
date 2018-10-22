
package talleraed2;


public class ArbolBinarioBusqueda {
    
    NodoArbol raiz; 
    
    
    public NodoArbol buscar(int info){
    
        NodoArbol p = this.raiz; 
        while(p != null){
            if(p.getInfo() == info) break; 
            if(info < p.getInfo()) p = p.getIzq(); 
            else p = p.getDer(); 
        }
        return p; 
    }
    
    
    
}

