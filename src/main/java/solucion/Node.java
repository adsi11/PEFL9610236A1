package solucion;

/**
 * Esta clase define un objeto de tipo Nodo
 * @author: Fernando Peña
 * @version: 1
 */
public class Node {
	public String data;
    public Node next;
    
    /**
     * 	Constructor para instanciar un objeto de tipo Nodo
     *	@param String que representa la información que contiene el Nodo
     */
    public Node(String data) {
        this.data = data;
        this.next = null;
    }
    
    /**
     * 	Método que invierte la lista enlazada
     *	@return 
     */
    public Node gus() {
        if(next == null) //en caso de que el siguiente esté vacío termina el método
        	return this;
        Node otro = next;
        next = null;
        
        Node tavo = otro.gus();
        otro.next = this;
        return tavo;
    }
  
    /**
     * Imprime en la consola la secuencia de Nodos que 
     * componen a esta lista. Por ejemplo, para la lista
     * que devuelve el método "build", la invocación de
     * este método escribe en la consola: 
     * 
     * A-->B-->C-->D-->E-->F-->
     * 
     * Lo anterior sería lo que se visualiza en la consola 
     * justo después de ejecutar las siguintes dos lineas:
     * 
     *         Node a = build();
     *         a.prn();
     *         
     */
    public void prn() {
        String resp = ""; Node primero = next;
    	if(primero == null)
    		System.out.println("No hay nodos en la lista enlazada.");
    	while(primero != null) {
    		resp += primero.data + "-->";
    		primero = primero.next;
    	}
    	System.out.println(resp);
    }
}
