package Circular_DoublyLinkedList;

import LinkedLists.SNode;

public class CircularLinkedList {
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

    public NODE insertAtEnd(int data, NODE node) {
        if (node == null) {
            return getNewNode(data);
        }
        NODE START = node;
        NODE newNode = getNewNode(data);
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        newNode.previous = node;
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
        while (node != null) {
            System.out.println("Previous:  " + node.previous + "  ------ " + "DATA: " + node.data + " ---- " + "Next: " + node.next);

            node = node.next;
        }

    }

    /*
---------------------------------------------------------------------------------------------
     Circular linked list codes
    */
    public NODE convertToCircular(NODE node) {
        System.out.println("Converting to circular.........");
        if (node == null) {
            return node;
        }
        NODE START = node;

        while (node.next != null) {
            node = node.next;
        }
        node.next = START;
        START.previous = node;
        return START;

    }

    public NODE insertAtBeginningOfCircular(int data, NODE node) {
        if (node == null) {
            return getNewNode(data);
        }
        NODE START = node;
        NODE newNode = getNewNode(data);
        newNode.previous = START.previous;
        newNode.previous.next = newNode;
        newNode.next = START;
        START.previous = newNode;

        START = newNode;
        return START;
    }


    public NODE insertAtEndOfCircular(int data, NODE node) {
        if (node == null) {
            return getNewNode(data);
        }
        NODE START = node;
        NODE newNode = getNewNode(data);
        newNode.previous = START.previous;
        newNode.previous.next = newNode;
        newNode.next = START;
        START.previous = newNode;


        return START;
    }

    public NODE insertAtPositionCircular(int data, NODE node, int pos) {
        if (pos < 1) {
            System.out.println("wrong pos");
            return node;
        } else if ((node == null) && (pos == 1)) {

            return insertAtBeginningOfCircular(data, node);
        } else if ((node == null) && (pos > 1)) {
            System.out.println("List is empty");
        }
        int j = 1;
        NODE START = node;
        NODE newNode = getNewNode(data);
        while (j < pos - 1) {
            node = node.next;
            j++;

        }
        newNode.next = node.next;
        newNode.previous = node;
        node.next = newNode;
        return START;

    }

    public NODE DeleteFromEndOfCircular(NODE node) {
        if (node == null) {
            return node;
        }
        NODE START = node;
        NODE last = START.previous;

        START.previous.previous.next = START;
        START.previous = last.previous;

        return START;
    }

    public NODE DeleteFromBeginningOfCircular(NODE node) {
        if (node == null) {
            return node;
        }
        NODE START = node;
        NODE last = START.previous;

        START = START.next;
        START.previous = last;
        last.next = START;

        return START;
    }

    public NODE DeleteCircular(NODE node) {
        node = null;

        return node;
    }

    public NODE DeleteAtPositionCircular(NODE node, int pos) {
        if (pos < 1) {
            System.out.println("wrong pos");
            return node;
        } else if ((node == null) && (pos > 1)) {
            System.out.println("List is empty");
        }
        int j = 1;
        NODE START = node;
        while (j < pos - 1) {
            node = node.next;
            j++;

        }
        NODE last = node.next;
        node.next = node.next.next;
        last = null;

//        node.next = node.previous.next;
//        node.previous = node.previous.next;
//        last = node.previous;
//        last.next =;
        return START;

    }

    public void PrintCircular(NODE node) {
        NODE START = node;
        while (node != null) {
            System.out.println("Previous:  " + node.previous + "  ------ " + "DATA: " + node.data + " ---- " + "Next: " + node.next);
            node = node.next;
            if (node == START) {
                break;
            }
        }

    }


}

