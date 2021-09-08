public class DoubleLinkedList {
    private Node backend; //Este es el ultimo nodo de la lista
    private Node head;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.backend = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            backend=newNode;
        }else{
            head.setPreceding(newNode);
        }
        newNode.setNext(this.head);
        this.head = newNode;
        this.size++;
    }

    public void addLast(Object data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }else{
            backend.setNext(newNode);
        }
        newNode.setPreceding(backend);
        backend = newNode;
        size++;
    }

    public Node deleteFirst(){
        if(isEmpty()){
            System.out.println("Error: List it's empty");
        }
        Node tmp = head;
        if(head == backend){
            head=backend=null;
        }else{
            head = head.getNext();
            head.setPreceding(null);
        }
        return tmp;
    }

    public void setHead(){
        this.head = head;
    }

    public Node getHead(){
        return this.head;
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.toString());
            node = node.getNext();
        }
        System.out.println();
    }

    //Test del funcionamiento de la doble lista enlazada

    /*public static void main(String[] args) {
        // Create an empty linked list
        DoubleLinkedList linked_list = new DoubleLinkedList();

        // Insert some elements in the list
        linked_list.addFirst(3);
        linked_list.addFirst(8);
        linked_list.addFirst(9);
        linked_list.addFirst(90);

        // Get and print the size of the list.
        // It should match the number of elements we inserted
        int size = linked_list.size();

        linked_list.deleteFirst();

        linked_list.show();

        System.out.println(size);

        System.out.println("Head: " + linked_list.getHead());
    }*/

}

