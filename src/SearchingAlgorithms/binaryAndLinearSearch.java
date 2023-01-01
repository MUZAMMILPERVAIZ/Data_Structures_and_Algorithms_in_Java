package SearchingAlgorithms;

public class binaryAndLinearSearch {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,50,55,66,77};
        int goal =55;

        System.out.println("[ INFO ] Searching Linearly... ");
        //TODO: LINEAR SEARCH
        for (int i = 0; i < array.length; i++) {
            if(goal == array[i]){
                System.out.println("[ INFO ] Found at index: "+i);
            }
        }



        //TODO: BINARY SEARCH
        System.out.println("[ INFO ] Searching through Binary... ");
        int mid = findMid(array);
        System.out.print("Mid Value OF Array Is "+ mid);
        binarySearch(array,mid,goal);


    }

    public static void binarySearch(int arr[], int mid, int goal){
        int lengthOne = mid+1;
        int lenghtTwo =( arr.length -1 ) - (mid);
        int a[] = new int[lengthOne];
        int b[] = new int[lenghtTwo];

        if (mid == goal){
            System.out.println("[ INFO ] Found at mid... ");
            return;
        }
        else if(goal< arr[mid]){
            for (int i = 0; i < lengthOne; i++) {
                a[i] = arr[i];
            }
            mid = findMid(a);
            binarySearch(a,mid,goal);
        } else if(goal > arr[mid]){
            int c=0;
            for (int i = mid; i < arr.length; i++) {
                b[c] = arr[i];
                c++;
            }
            mid = findMid(b);
            binarySearch(b,mid,goal);
        }
    }

    public static int findMid(int array[]){
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) >>> 1;
        return mid;
    }
}
