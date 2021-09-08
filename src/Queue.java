public class Queue {
    private DoubleLinkedList innertList;

    public Queue(){
        innertList = new DoubleLinkedList();
    }

    public void enqueue(Object data){
        innertList.addLast(data);
    }

    public Object peek(){
        return innertList.getHead();
    }

    public Object dequeue(){
        Object data = peek();
        innertList.deleteFirst();
        return data;
    }
    public void show(){
        innertList.show();
    }

    //Main de la clase Queue. Permite ver el funcionamiento de la clase

    public static void main(String[] args){
        Queue queuelist = new Queue();
        queuelist.enqueue(5);
        queuelist.enqueue(8);
        queuelist.enqueue(3);
        queuelist.enqueue(12);
        queuelist.enqueue(0);
        queuelist.enqueue(89);
        queuelist.enqueue(77);
        System.out.println("Lista completa:");
        queuelist.show();

        queuelist.dequeue();
        queuelist.dequeue();
        queuelist.dequeue();
        System.out.println("Lista con los elementos borrados:");
        queuelist.show();
    }
}

