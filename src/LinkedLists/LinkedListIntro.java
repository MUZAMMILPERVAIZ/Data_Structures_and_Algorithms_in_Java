package LinkedLists;

public class LinkedListIntro {

    public static void main(String[] args) {
        Node node = null;
        LinkedList linkedList = new LinkedList();
        node = linkedList.insert(12, node);
        node = linkedList.insert(13, node);
        node = linkedList.insert(14, node);
        node = linkedList.insert(15, node);
        node = linkedList.insert(16, node);
        node = linkedList.insert(17, node);
        node = linkedList.insert(18, node);
        node = linkedList.insert(19, node);
        linkedList.Print(node);
    }
}

