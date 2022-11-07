package Circular_DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
    NODE node = null;
        CircularLinkedList doubleLinkedList = new CircularLinkedList();
        node = doubleLinkedList.insertAtBeginning(12, node);
        node = doubleLinkedList.insertAtBeginning(13, node);
        node = doubleLinkedList.insertAtBeginning(14, node);
        node = doubleLinkedList.insertAtPosition(145, node, 1);
        node = doubleLinkedList.insertAtPosition(175, node, 3);
        node = doubleLinkedList.insertAtEnd(14, node);
                doubleLinkedList.Print(node);

                System.out.println("");
        node = doubleLinkedList.convertToCircular(node);
          System.out.println("-------------------Converted to circular-------------------------- ");
        doubleLinkedList.PrintCircular(node);
         node = doubleLinkedList.insertAtBeginningOfCircular(1904, node);
           System.out.println("-------------- inserting at begining of circular --------------- ");
        doubleLinkedList.PrintCircular(node);
        
        node = doubleLinkedList.insertAtEndOfCircular(104, node);
         System.out.println("-------------- inserting at End of circular --------------- ");
        doubleLinkedList.PrintCircular(node);
        node = doubleLinkedList.insertAtPositionCircular(10904, node,3);
         System.out.println("-------------- inserting at any position  of circular --------------- ");
        doubleLinkedList.PrintCircular(node);
             
        System.out.println("-------------------------------------------------------------------------------");

        node = doubleLinkedList.DeleteFromEndOfCircular(node);
        System.out.println("----------- Delete from end of circuler-------------------");
        doubleLinkedList.PrintCircular(node);
        System.out.println("");
        node = doubleLinkedList.DeleteFromBeginningOfCircular(node);
        System.out.println("-----------delete from begining -----------------");
        doubleLinkedList.PrintCircular(node); 
        System.out.println("");
        node = doubleLinkedList.DeleteCircular(node);
        System.out.println("--------------Full deleted circuler list is :");
        doubleLinkedList.PrintCircular(node); 
        

    }
}

