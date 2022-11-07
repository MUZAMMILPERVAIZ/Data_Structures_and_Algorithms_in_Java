package Queue_using_LinkedList;

import LinkedLists.SNode;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.insert(12);
        queue.insert(132);
        queue.insert(52);
        queue.Print();
        queue.deQueue();
        System.out.println("\n After dequeue.....");
        queue.Print();


    }
}
