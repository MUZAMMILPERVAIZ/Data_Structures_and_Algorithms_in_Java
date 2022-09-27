package LinkedLists;

public class LinkedListIntro {

    public static void main(String[] args) {
        Node node = null;
        LinkedList linkedList = new LinkedList();
        node= linkedList.insert(12,node);
        node= linkedList.insert(13,node);
        node= linkedList.insert(14,node);
        node= linkedList.insert(15,node);
        node= linkedList.insert(16,node);
        node= linkedList.insert(17,node);
        node= linkedList.insert(18,node);
        node= linkedList.insert(19,node);
        linkedList.Print(node);
    }
}
class Node{
    int data;
    Node next;
}
class LinkedList{
    public Node insert(int data, Node node){
        if (node==null){
            node = getNewNode(data);
        }
        else {
            node.next = insert(data, node.next);

        }
        return node;

    }
    public Node getNewNode(int data){
        Node node = new Node();
        node.data= data;
        node.next = null;
        return  node;

    }
    public void Print(Node node){
        if (node==null){
           return;
        }
        else {
            System.out.println(node.data+" ---- "+ node.next);
            Print(node.next);
        }
    }
}
