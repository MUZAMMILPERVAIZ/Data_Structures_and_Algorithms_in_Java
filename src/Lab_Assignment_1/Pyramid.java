package Lab_Assignment_1;

public class Pyramid {

    public static void main(String[] args) {
        System.out.println("Numbers pyramid: ");
        numbersPyramid();
        System.out.println("Staric pyramid: ");
        staricPyramid();
    }
    public static void numbersPyramid(){
        int x=1;
        for (int i = 0; i <= 5; i++) {
            for (int s = 5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x+=x;
            }
            for (int j =(i+1); j >= 1; j--) {
                System.out.print(x);
                x=x/2;
            }
            System.out.println();
            x=1;
        }


    }
    public static void staricPyramid(){

        for (int i = 0; i <= 5; i++) {
            for (int s = 5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j =(i+1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
