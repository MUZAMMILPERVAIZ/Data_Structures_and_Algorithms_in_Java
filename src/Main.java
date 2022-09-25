import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double [] Marks= new double[5];
        double marks;
        int a;
        int b;
        System.out.println("Hello world!");
        int index=0, index1=0;
        System.out.println("Enter marks of five students:-");
        while (index1<5){
            System.out.println("Enter marks no "+ (index1) +" : ");
            marks= new Scanner(System.in).nextDouble();
            Marks[index1] = marks;
            index1++;
        }
        System.out.println();
        for (double item: Marks) {
            System.out.print(item +" , ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        do {
            System.out.println("Enter an integers: ");
            a = new Scanner(System.in).nextInt();
            System.out.println("Enter an integers: ");
            b = new Scanner(System.in).nextInt();
            sumOfPositiveNumbers(a, b);
            index++;
        }while (index<=5);

    }


    public static void sumOfPositiveNumbers(int x, int y){
        String error="No positive input";
        if((x>0)&&(y>0)) {
            System.out.println("sum is:"+ (x + y));
        }
        else {
            System.out.println(error);
        }
    }
}