package Lab_Assignment_1;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int totalRecords ;
        double maxNum = 0;
        int maxIndex = 0;
        System.out.println("Enter total number of records: ");
        totalRecords = new Scanner(System.in).nextInt();
        String[] names = new String[totalRecords];
        double[] marks = new double[totalRecords];

        for (int i = 0; i < totalRecords; i++) {
            System.out.println("Enter name of student number "+(i+1)+" : ");
            names[i] = new Scanner(System.in).next();
            System.out.println("Enter marks of student number "+(i+1)+" : ");
            marks[i] = new Scanner(System.in).nextDouble();
        }
        for (int i = 0; i < totalRecords; i++) {
           if(marks[i]> maxNum){
               maxNum = marks[i];
               maxIndex = i;
           }

        }
        System.out.println("Student  "+names[maxIndex]+" has highest marks :  "+ marks[maxIndex]);

    }
}
