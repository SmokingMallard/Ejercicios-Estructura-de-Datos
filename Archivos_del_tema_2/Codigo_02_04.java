 /**

     * Poner un valor en la posición inicial

     * @param value to  insert

     */

   public void insertAtFirstPosition(int value) {

         Node nodeToInsert = new Node(value);//Nodo a insertar

         nodeToInsert.next = firstNode;//Nodo que recorre la lista

		 if (this.isEmpty()){ //si la lista está vacía

		 	this.insertAtFirstPosition(value);

			//insertamos en la primer pos

		} else {

		//recorreremos la lista hasta encontrar el último elemento

         while (currentNode.next!=null){

		 currentNode =currentNode.next;

		 }

		 //En nodo último apuntara al nodo a insertar

            currentNode.next = nodeToInsert;

        }

		}

    
    /**

     * Revisa si la lista está vacía

     * @return

     */

    public boolean isEmpty(){

        //Revisa si el primer nodo está vacío

        return (this.firstNode==null);

    }