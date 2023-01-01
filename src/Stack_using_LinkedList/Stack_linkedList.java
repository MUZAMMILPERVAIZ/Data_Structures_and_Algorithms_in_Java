package Stack_using_LinkedList;

import LinkedLists.LinkedList;
import LinkedLists.SNode;

public class Stack_linkedList {
    LinkedList linkedList = new LinkedList();

    public SNode push(int data, SNode node) {
        return linkedList.insertAtBeginning(data, node);
    }

    public SNode pop(SNode node) {
        return linkedList.deleteFromBeginning(node);
    }


    public void Print(SNode node) {
        linkedList.Print(node);
    }

    public static void main(String[] args) {
        Stack_linkedList stack = new Stack_linkedList();
        SNode node = null;
        node = stack.push(45, node);
        node = stack.push(50, node);
        node = stack.push(55, node);
        node = stack.push(60, node);
        stack.Print(node);
        System.out.println("-------------------------------");
        System.out.println("After Poping from Stack");
        System.out.println();
        node=stack.pop(node);
        stack.Print(node);

    }

}

