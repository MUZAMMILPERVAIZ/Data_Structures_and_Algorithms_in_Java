package LinkedLists;

public class DoubleList_main {
    public static void main(String[] args) {
        NODE node = null;
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        node = doubleLinkedList.insertAtBeginning(12, node);
        node = doubleLinkedList.insertAtBeginning(13, node);
        node = doubleLinkedList.insertAtBeginning(14, node);
        node = doubleLinkedList.insertAtPosition(145, node, 1);
        node = doubleLinkedList.insertAtPosition(175, node, 3);

        doubleLinkedList.Print(node);
        System.out.println();
        doubleLinkedList.printSum(node);

        System.out.println();
        doubleLinkedList.printOnlyEven(node);

        System.out.println();
        doubleLinkedList.printOnlyODD(node);


        Node n = null;
        LinkedList linkedList = new LinkedList();
        n = linkedList.insert(12, n);
        n = linkedList.insert(13, n);
        n = linkedList.insert(14, n);
        n=linkedList.convertToCircular(n);
      linkedList.SearhCircular(n,13);

    }
}
