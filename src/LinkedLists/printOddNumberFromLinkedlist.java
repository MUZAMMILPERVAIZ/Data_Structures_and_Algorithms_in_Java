package LinkedLists;

public class printOddNumberFromLinkedlist {
    public static void main(String[] args) {
        Node node = null;
        LinkedList linkedList = new LinkedList();
        node = linkedList.insert(17, node);
        node = linkedList.insert(18, node);
        node = linkedList.insert(20, node);
        node = linkedList.insert(23, node);
        node = linkedList.insert(25, node);
        node = linkedList.insert(26, node);
        node = linkedList.insert(29, node);
        node = linkedList.insert(30, node);
        node = linkedList.insert(33, node);
        node = linkedList.insert(36, node);
      //  linkedList.Print(node);
        System.out.println();
        linkedList.printOddData(node);
    }
}


