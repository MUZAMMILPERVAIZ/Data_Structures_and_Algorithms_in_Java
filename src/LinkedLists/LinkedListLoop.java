package LinkedLists;

public class LinkedListLoop {
    public static void main(String[] args) {
        SNode node = null;
        LinkedList linkedList = new LinkedList();
        node= linkedList.insertAtLast(12,node);
        node= linkedList.insertAtLast(13,node);
        node= linkedList.insertAtLast(14,node);
        node= linkedList.insertAtPosition(15,node,2);
        node= linkedList.insertAtLast(16,node);
        node= linkedList.insertAtLast(17,node);
        node= linkedList.insertAtLast(18,node);
        node= linkedList.insertAtLast(19,node);
        node= linkedList.insertAtBeginning(1,node);
        node= linkedList.insertAtPosition(145,node,4);
        node= linkedList.insertAtPosition(145,node,12);
        node= linkedList.insertAtPosition(145,node,1);
        linkedList.PrintUsingLoop(node);

        //node = deleteFromBeginning(node);

    }
}
