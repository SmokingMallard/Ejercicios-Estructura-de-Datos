/**

  * Encontrar un  nodo con un valor específico

  * @param value

  * @return Nodo  con la información

  */

  public Node find(int value) {

  Node result = null; // Nodo a  regresar      

  Node  currentNode = this.firstNode;//Nodo que recorre la lista

  boolean  finded = false;

  

  //Mientras  no hayamos llegado al final

  //y el  resultado aún sea nulo

  while(currentNode!= null && !finded){

      if(currentNode.data == new Integer(value)){

  finded= true;

  result = currentNode;

  }

  currentNode= currentNode.next;

  }

  

  return result;

  } 