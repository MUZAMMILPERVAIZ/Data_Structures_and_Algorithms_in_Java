package LinkedLists;

public class LinkedList {
    public SNode insert(int data, SNode node) {
        if (node == null) {
            node = getNewNode(data);
        } else {
            node.next = insert(data, node.next);
        }
        return node;
    }

    public SNode insertAtLast(int data, SNode node) {
        if (node == null) {
            return getNewNode(data);
        }

        SNode newNode = node;
        while (node.next != null) {
            node = node.next;
        }
        node.next = getNewNode(data);
        return newNode;


    }
    public SNode insertAtBeginning(int data, SNode node) {
        if (node == null) {
            return getNewNode(data);
        }
        SNode START = node;
        SNode newNode = getNewNode(data);
        newNode.next = START;
        START=newNode;
        return START;
    }
    public SNode insertAtPosition(int data, SNode node, int pos) {
        if(pos<1){
            System.out.println("List is empty");
            return node;
        }
        else if ((node == null)&&(pos==1)) {

            return insertAtBeginning(data,node);
        }
        else if ((node==null)&&(pos>1)) {
            System.out.println("List is empty");
        }

        int j = 1;
        SNode TEMP = node;
        SNode newNode = getNewNode(data);
        while (j<pos-1){
            node= node.next;
            if(node.next== null){
                System.out.println("Position not found");
                break;
            }
            j++;
        }

        newNode.next = node.next;
        node.next =newNode;
        return TEMP;
    }
    public SNode deleteFromBeginning(SNode node){
        return node.next;
    }
    public SNode deleteFromLast(SNode node){
        SNode start = node;
        while (node.next!=null){
            node= node.next;
        }
        node = null;
        return start;
    }

    public SNode getNewNode(int data) {
        SNode node = new SNode();
        node.data = data;
        node.next = null;
        return node;

    }

    public void Print(SNode node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.data + " ---- " + node.next);
            Print(node.next);
        }
    }

    public void PrintUsingLoop(SNode node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.println(node.data + " ---- " + node.next);
            node = node.next;
        }
    }

    public void printOddData(SNode node) {
        if (node == null) {
            return;
        } else {
            if ((node.data) % 2 != 0) {
                System.out.println(node.data + " ---- " + node.next);

            }
            Print(node.next);


        }
    }
    //TODO Question 3
    public SNode convertToCircular(SNode node){
        if (node == null) {
            System.out.println("empty list");;
        }
        System.out.println("[Converting to circular Linked list......]");
        SNode start = node;
        while (node.next!=null){
            node=node.next;
        }
        node.next =start;
        return start;
    }

    public void SearhCircular(SNode node, int data){
        int count=0;
        while (node!=null){
            count++;
            if(node.data == data){
                System.out.println("found at: "+count+ " address: "+node);
                break;
            }
            node=node.next;
        }
    }

}
