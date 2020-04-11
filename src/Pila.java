
public class Pila {
 
    // Campos
   private static final int TAM_PILA = 100;
   private Object[] pila; // Variable del arreglo estático de la pila
   private int idxTope; // Índice del tope de la pila
   
   // Constructor
   public Pila() {
       // Crear el arreglo
       pila = new Object[TAM_PILA];
       // Indicar que todavía no tiene elementos la pila
       idxTope = -1;        
   }
   
   // Métodos de la especificación
   public boolean estaVacia() {
       if(idxTope == -1) {
           return true;
       } else {
           return false;
       }
   }
   
   public void apilar(Object x) {
       // Verificar que haya espacio en el arreglo
       if(idxTope + 1 < TAM_PILA) {
           idxTope++;
           pila[idxTope] = x;
           //pila[++idxTope] = x;
       } else {
           // Lanzar una excepción de desborde de pila ("stack overflow")
           throw new StackOverflowException();
       }
   }
   
   public Object desapilar() {
       Object x = null;
       
       // Verificar que la pila no esté vacía
       if(!estaVacia()) {
           x = pila[idxTope];
           pila[idxTope] = null; // Borrar la referencia del objeto en el arreglo
           idxTope--;
       }
       
       return x;
   }
   
   public Object tope() {
       Object x = null;
       
       // Verificar que la pila no esté vacía
       if(!estaVacia()) {
           x = pila[idxTope];
       }
       
       return x;
   }
   
   // Sobrescritura de toString() para que se regrese un objeto de tipo
   // String con el contenido actual de la pila
   @Override
   public String toString() {
       String s = "";
       
       // Guardar en el la variable s el contenido de la pila
       for(int i=idxTope; i>=0; --i) {
           s += pila[i];
           s += "\n";
       }        

       return s;
   } 

}