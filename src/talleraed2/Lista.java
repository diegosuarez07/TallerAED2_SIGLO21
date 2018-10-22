
package talleraed2;


public class Lista {
    
    Nodo frente; 
    
    public Lista(){
        this.frente = null; 
         
    }
    
    public void insertarPorDelante(int info){
    
        Nodo p = new Nodo(); 
        p.setInfo(info);
        p.setSig(this.frente);    
        this.frente = p; 
        
        
    }
    
    public Nodo buscar(int info){
    
        //ponele que tenga una lista 
        //el nodo p que estoy creando aca empieza apuntando a la referencia siguiente 
        Nodo p = this.frente; 
        while(p != null){
        
            if(p.getInfo() == info) break;
            p = p.getSig(); 
            
            
        }
        return p; 
        
        
        
    }
    
    
    public void borrarPrimero(){
    
        if(this.frente != null){
            Nodo p = this.frente; 
            this.frente = this.frente.getSig(); 
            p.setSig(null);
            p = null; 
            
        }
    
    }
    
    
    public void mostrar(){
        
        Nodo p = this.frente; 
        while(p != null){
        
            System.out.println("El valor de la informacion del nodo es:" + p.getInfo());
            p = p.getSig(); 
            
        }
    }
    
    
    public void eliminar(int info){
    
    //hacer
    

    if (this.frente == null){
        System.out.println("Lista vacia");
        return; 
    }
    else{
        
        Nodo p = this.frente; 
        while(p != null){
        
                if(p.getInfo() == info){
                    
                    this.frente.setSig(p.getSig()); 
                    p.setSig(null);
                    //p.setInfo(0);
                     
                    
                    
                    p = null; 
                }
                else{
                    p = p.getSig(); 
                }
        
        
        }
    
    }
    }

    
//    public Nodo buscarRecursivo(int info, Nodo p){
//        
//    }
    
    
}
