package LinkedLists;

public class LinkedList {
    public Node insert(int data, Node node) {
        if (node == null) {
            node = getNewNode(data);
        } else {
            node.next = insert(data, node.next);
        }
        return node;
    }

    public Node insertAtLast(int data, Node node) {
        if (node == null) {
            return getNewNode(data);
        }

        Node newNode = node;
        while (node.next != null) {
            node = node.next;
        }
        node.next = getNewNode(data);
        return newNode;


    }
    public Node insertAtBeginning(int data, Node node) {
        if (node == null) {
            return getNewNode(data);
        }
        Node START = node;
        Node newNode = getNewNode(data);
        newNode.next = START;
        START=newNode;
        return START;


    }
    public Node insertAtPosition(int data, Node node, int pos) {
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
        Node TEMP = node;
        Node newNode = getNewNode(data);
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
    public Node getNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;

    }

    public void Print(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.data + " ---- " + node.next);
            Print(node.next);
        }
    }

    public void PrintUsingLoop(Node node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.println(node.data + " ---- " + node.next);
            node = node.next;
        }
    }

    public void printOddData(Node node) {
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
    public Node convertToCircular(Node node){
        if (node == null) {
            System.out.println("empty list");;
        }
        System.out.println("[Converting to circular Linked list......]");
        Node start = node;
        while (node.next!=null){
            node=node.next;
        }
        node.next =start;
        return start;
    }

    public void SearhCircular(Node node, int data){
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
