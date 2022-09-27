package Lab_Assignment_1;

public class Loops {
    public static void main(String[] args) {
        int sep = 0;

        System.out.println(" Divisible by 5 or 6");
        for (int i = 100; i <= 1000 ; i++) {
                if ((i%5==0)||(i%6==0)) {
                    if (sep%10==0){
                        System.out.println();
                    }
                    System.out.print(i + " , ");
                    sep++;

                }
        }
        sep =0;
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(" Divisible by 5 and 6");
        for (int i = 100; i <= 1000 ; i++) {
            if ((i%5==0)&&(i%6==0)) {
                if (sep%10==0){
                    System.out.println();
                }
                sep++;
                System.out.print(i + " , ");
            }
        }

    }
}
