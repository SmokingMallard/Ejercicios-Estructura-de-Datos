/**

     * Poner un valor en la posición inicial

     * @param value to  insert

     */

    public void insertAtFirstPosition(int value) {

         Node nodeToInsert = new Node(value);

         nodeToInsert.next = firstNode;

         firstNode = nodeToInsert;

    }

     /**

     * Muestra toda la lista

     */

    public void show(){

        //Nodo que recorre la lista

        Node currentNode= this.firstNode;

        //Mientras que el nodo no haya encontrado el final

        //muestra el valor del nodo actual

        while (currentNode!= null){

            System.out.print(currentNode.data+" ");

            currentNode= currentNode.next;

        }

    }