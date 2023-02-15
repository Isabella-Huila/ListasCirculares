public class CircularList {

    private Node head;
    private  Node tail; // prueba git.

// la cabeza no va a cambiar, TENER EN CUENTA
    public void addNode( Node node){
        if(head == null){
            head =  node;
            head.setNext(head);
            head.setPrevius(head);


        }else{
            Node tail= head.getPrevius();
            node.setNext(head);
            head.setPrevius(node);
            tail.setNext(node);
            node.setPrevius(tail);


        }

    }

    private void print(Node current){
        if(current == head.getNext()){

        }
    }
}
