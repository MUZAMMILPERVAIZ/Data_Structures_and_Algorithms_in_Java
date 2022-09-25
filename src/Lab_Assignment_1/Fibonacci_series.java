package Lab_Assignment_1;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int index ;
        System.out.println("Enter a number : ");
        index = new Scanner(System.in).nextInt();
        int num1=0, num2 =1, res;
        for (int i = 0; i < index; i++) {
            System.out.print(num1+" --- ");
            res = num1+num2;
            num1 = num2;
            num2 = res;

        }
    }
}
