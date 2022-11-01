package Stack_using_LinkedList;

import LinkedLists.LinkedList;
import LinkedLists.SNode;

public class Stack_linkedList {
    SNode FRONT=null;
    LinkedList linkedList = new LinkedList();
    public void push(int data){
        if(FRONT==null){
            linkedList.getNewNode(data);
        }
        SNode temp = linkedList.getNewNode(data);

    }
}
