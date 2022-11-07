package Queue_using_LinkedList;

import LinkedLists.SNode;

public class Queue {
    SNode front;
    SNode rear;

    public void insert(int val){
        if(rear==null){
            front=rear=getNewNode(val);
            return;
        }
        else{
            rear.next=getNewNode(val);
            rear=rear.next;

        }
    }

    public void deQueue(){
        if(rear==null){
            System.out.println("Empty List");
            return ;
        }
        else{
           front = front.next;

        }
    }
    public SNode getNewNode(int val ){
        SNode node=new SNode();
        node.data=val;
        node.next=null;
        return node;
    }

    public void Print(){
        SNode node = front;
        while(node!=null){
            System.out.println("[DATA]: "+node.data+" [NEXT]: "+ node.next);
            System.out.println(node.next);
            node=node.next;

        }

    }
}
