package LinkedLists;

public class DoubleLinkedList {
    public NODE insertAtBeginning(int data, NODE node) {
        if (node == null) {
            return getNewNode(data);
        }
        NODE START = node;
        NODE newNode = getNewNode(data);
        newNode.next = node;
        node.previous = newNode;
        START = newNode;
        return START;
    }

    public NODE insertAtPosition(int data, NODE node, int pos) {
        if (pos < 1) {
            System.out.println("List is empty");
            return node;
        } else if ((node == null) && (pos == 1)) {

            return insertAtBeginning(data, node);
        } else if ((node == null) && (pos > 1)) {
            System.out.println("List is empty");
        }
        int j = 1;
        NODE TEMP = node;
        NODE newNode = getNewNode(data);
        while (j < pos - 1) {
            node = node.next;
            if (node.next == null) {
                System.out.println("Position not found");
                break;
            }
            j++;

        }
        newNode.next = node.next;
        newNode.previous = node;
        node.next = newNode;
        return TEMP;

    }

    public NODE getNewNode(int data) {
        NODE node = new NODE();
        node.data = data;
        node.next = null;
        node.previous = null;
        return node;

    }

    public void Print(NODE node) {
        if (node == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("DATA: " + node.data + " ---- " + "Next: " + node.next + "------" + "Previous:  " + node.previous);
            Print(node.next);
        }
    }
    //TODO Question 1
    public void printOnlyEven(NODE node){
        System.out.println("EVEN NODES OF LINKED LIST");
        while (node!= null){
            if (node.data % 2 == 0) {
                System.out.println("DATA: " + node.data );
            }
            node=node.next;
        }
    }
    public void printOnlyODD(NODE node){
        System.out.println("ODD NODES OF LINKED LIST");
        while (node!= null){
            if (node.data % 2 != 0) {
                System.out.println("DATA: " + node.data );
            }

            node=node.next;
        }
    }


    //TODO Question 2
    int sumOfEven, sumOfOdd;

    public void printSum(NODE node) {
        while (node != null) {
            if (node.data % 2 == 0) {
                sumOfEven += node.data;
            } else {
                sumOfOdd += node.data;
            }
            node=node.next;
        }
        System.out.println("Sum of Even:" + sumOfEven);
        System.out.println("Sum of Odd:" + sumOfOdd);
    }



}

