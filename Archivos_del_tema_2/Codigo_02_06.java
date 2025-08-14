/**

     * Borrar un nodo de acuerdo a su posición

     * @param position

     * @throws Exception 

     */ 

    public void delete(int position) throws Exception{

        

        Node currentNode = null;//Nodo que recorre la lista

         

        if(this.isEmpty()){ //Si la lista está vacía lanza un error.

            throw new Exception("La lista está vacía");

        }

        

        if (position==1){ //si la posición es 1 entonces reacomodamos el 

                            //primer nodo de la lista

            firstNode= firstNode.next;

        } else {

            currentNode = firstNode;

            //Nos movemos hasta la posición anterior al nodo a borrar

            for (int i=1;i<position-1;i++){

                if (currentNode.next != null){

                   throw new Exception("La posición es mayor al tamaño "

                           + "de la lista");

                }

                currentNode=currentNode.next;//avanzamos el nodo

            }

            

         //Igualaremos el next del nodo anterior al next del nodo a borrar

            currentNode.next = (currentNode.next).next;           

        }        