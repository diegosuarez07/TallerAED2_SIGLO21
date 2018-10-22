
package talleraed2;

public class TallerAED2 {

   
    public static void main(String[] args) {
        
        int num1 = 30; 
        System.out.println("El factorial de " + num1 + " es de " + factorialR(num1));
        
        
        Lista miLista = new Lista(); 
        miLista.insertarPorDelante(10);
        miLista.insertarPorDelante(19);
        miLista.insertarPorDelante(77);
        miLista.insertarPorDelante(24);
        
        miLista.eliminar(77);
        
        miLista.mostrar();

        
        
        
        
        
        
    }
    
    //en recursion no podemos usar ciclos for y while porque son ciclos iterativos, aca tengo que usar ciclos recursivos.
    public static int factorialR(int n){
    
        if(n == 0){
            return 1; 
        }
        else{
            return n * factorialR(n-1); 
        }
    
    }

    
        public static int factorialI(int n){

        int resultado = 1;

        if(n > 0) {
            resultado = n;
            while (n > 1) {
                n = n - 1;
                resultado = resultado * n;
            }
        }

        return resultado;

    }

    
}
