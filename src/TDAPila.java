
public class TDAPila { 

    public static void main(String[] args) {
        
        Pila p = new Pila();
        
        System.out.println("¿La pila está vacía? " +  
                (p.estaVacia() ? "Sí" : "No")
        );
        
        p.apilar("Karen");
        p.apilar("Juan");

        System.out.println();
        System.out.println("¿La pila está vacía? " +  
                (p.estaVacia() ? "Sí" : "No")
        );
        System.out.println();
        System.out.println("Contenido actual de la pila:");
        System.out.println(p); // p.toString()
        
        p.apilar("Pedro");
        p.apilar("María");
        
        System.out.println("Tope de la pila: " + p.tope());
    
        String s = (String)p.desapilar();
        
        System.out.println("Objeto desapilado: " + s);

        System.out.println();
        System.out.println("Contenido actual de la pila:");
        System.out.println(p); // p.toString()
        
        System.out.println("******************");
        System.out.println("Vaciado de la pila");
        vaciarPila(p);
        
        System.out.println("¿La pila está vacía? " +  
                (p.estaVacia() ? "Sí" : "No")
        );

        // Meter 100 números a la pila
        for(int i=0; i<101; ++i) {
            p.apilar(i);
        }
        
        System.out.println("******************");
        System.out.println("Vaciado de la pila");
        vaciarPila(p);
        
        
    } // Fin de main

    /** Método que saca todos los elementos restantes de la pila dada como
     *  argumento, y los despliega.
     */
    public static void vaciarPila(Pila p) {
        while(!p.estaVacia()) {
            System.out.println(p.desapilar());
        }
    }
    
}
