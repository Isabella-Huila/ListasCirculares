public class Node {

    private Node next;

    private  Node previus;

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node(String name) {
        this.name = name;
    }

    public Node getNext(Node head) {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevius() {
        return previus;
    }

    public void setPrevius(Node previus) {
        this.previus = previus;
    }}


