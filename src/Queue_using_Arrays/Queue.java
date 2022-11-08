package Queue_using_Arrays;

import javax.swing.text.TableView;

public class Queue {
    private int max = 15;
    private int size = 0;
    private int front = -1, rear = -1;
    private int[] queue = new int[max];

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            front++;
            rear++;
            queue[rear]=value;
            size++;
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    private boolean isFull() {
        if(rear==max){
            return true;
        }
        return false;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        queue[front]=0;
        front++;

    }

    private boolean isEmpty() {
        if((front==-1)&&(rear==-1)){
            return true;
        }
        return false;
    }

    public void Print(){
        for (int i = front; i < size; i++) {
            System.out.print(queue[i]+" ---- ");
        }
    }

    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.dequeue();
        System.out.println("\nInserting in Queue......");
        queue1.enqueue(45);
        queue1.enqueue(50);
        queue1.enqueue(55);
        queue1.enqueue(60);
        System.out.println("\nPrinting Queue..........");
        queue1.Print();
        System.out.println("\nRemoving From Queue......");
        queue1.dequeue();
        queue1.dequeue();
        queue1.Print();

    }


}
