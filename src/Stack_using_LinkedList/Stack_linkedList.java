package Stack_using_LinkedList;

import LinkedLists.LinkedList;
import LinkedLists.Node;

public class Stack_linkedList {
    Node FRONT=null;
    LinkedList linkedList = new LinkedList();
    public void push(int data){
        if(FRONT==null){
            linkedList.getNewNode(data);
        }
        Node temp = linkedList.getNewNode(data);

    }
}
