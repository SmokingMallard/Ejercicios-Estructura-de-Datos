public class  List<E> {

     Node<E> firstNode;

    /**

     * Constructors

     * 

     */

    public List() {

         this.firstNode = null;

    }
    

    public List(Node firstNode) {

         this.firstNode = firstNode;

    }

    /** 

    * Setters y getters

    */ 

    public Node getFirstNode() {

     return firstNode;

  }  

