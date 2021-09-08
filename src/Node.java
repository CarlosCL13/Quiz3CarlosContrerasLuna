public class Node {
    private Node preceding; //hace referencia al nodo anterior
    public Object data;
    public Node next; //hace referencia al nodo siguiente

    public Node(Object data) {
        this.next = null;
        this.data = data;
        this.preceding = null;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPreceding(Node pnode){this.preceding = pnode;}

    public Node getPreceding(){return this.preceding;}

    //Permite visualizar la lista de una forma organizada
    public String toString(){
        String sNode = "[ " + this.getData() + " ] -->";
        return sNode;
    }
}

