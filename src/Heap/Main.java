package Heap;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

//    TODO : method 1
//    PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
//      @Override
//      public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//      }
//    });


        System.out.println("-----------------Max Heap--------------------");
//    TODO : method 2
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(0);
        maxHeap.add(7);
        maxHeap.add(13);
        maxHeap.forEach(item -> System.out.print(item + " "));
        System.out.println();
        System.out.println("Max element -> " + maxHeap.peek());
        maxHeap.remove();
        System.out.println("Max element -> " + maxHeap.peek());
        System.out.println();
        System.out.println("-----------------MIN Heap--------------------");
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(0);
        minHeap.add(7);
        minHeap.add(13);
        minHeap.forEach(item -> System.out.print(item + " "));
        System.out.println();

        System.out.println("Min element -> " + minHeap.peek());
        maxHeap.remove();
        System.out.println("Min element -> " + minHeap.peek());


    }
}
