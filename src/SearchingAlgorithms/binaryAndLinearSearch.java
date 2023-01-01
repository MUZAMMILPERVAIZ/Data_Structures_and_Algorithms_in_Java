package SearchingAlgorithms;

public class binaryAndLinearSearch {
    public static int steps = 0;

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 50, 55, 66, 77};
        int goal = 77;
        System.out.println("----------------------------------------");
        System.out.println("[ INFO ] Linear Search... ");
        //TODO: LINEAR SEARCH
        for (int i = 0; i < array.length; i++) {
            if (goal == array[i]) {

                System.out.println("[ INFO ] Found at index: " + i);
            }
        }


        int mid = findMid(array);
        System.out.print("Mid Value OF Array Is " + mid);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("----------------------------------------");
        //TODO: BINARY SEARCH
        System.out.println("\n[ INFO ] Binary Search... ");
        binarySearch(array, mid, goal);


    }

    public static void binarySearch(int[] arr, int mid, int goal) {
        steps++;
        System.out.println("\n-------------------------- [ ARRAY ] ----------------------------:");
        for (int element : arr) {
            System.out.print(element + "  ");
        }
        int lengthOne = mid + 1;
        int lenghtTwo = (arr.length - 1) - (mid);
        int a[] = new int[lengthOne];
        int b[] = new int[lenghtTwo];

        if (arr[mid] == goal) {
            System.out.println("\n-------------------------- [ INFO ] ----------------------------:");
            System.out.println(" Found at mid... ");
            System.out.println(" Steps: " + steps);
            return;
        } else if (goal < arr[mid]) {
            for (int i = 0; i < lengthOne; i++) {
                a[i] = arr[i];
            }
            mid = findMid(a);
            binarySearch(a, mid, goal);
        } else if (goal > arr[mid]) {
            int c = 0;
            for (int i = mid + 1; i < arr.length; i++) {
                b[c] = arr[i];
                c++;
            }
            mid = findMid(b);
            binarySearch(b, mid, goal);
        }
    }

    public static int findMid(int array[]) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) >>> 1;
        return mid;
    }
}
