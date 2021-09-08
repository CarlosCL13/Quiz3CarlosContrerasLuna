public class Stack {
    private DoubleLinkedList stackList;

    // Class constructor
    public Stack() {
        stackList = new DoubleLinkedList();
    }

    public void push(Object newElement) { this.stackList.addFirst(newElement);}

    public Node pop() {
        return this.stackList.deleteFirst();
    }

    public Object peek() { return this.stackList.getHead(); }

    //Test del funcionamiento del Stack

    /*
    public static void main(String[] args) {
        // Create an empty linked list
        Stack stack = new Stack();

        // Insert some elements in the list
        stack.push(3);
        stack.push(8);
        stack.push(9);
        stack.push(1);

        // Pop an element from the stack and confirm it is the last one inserted
        // Notice that stack.pop returns a Node type, and you should cast it to int
        // before print it
        Node last_node = stack.pop();
        int element = (int) last_node.getData();

        System.out.println(element);
    }*/
}

