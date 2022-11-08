package Priority_Queue;

public class Queue {
    private int max = 15;
    private int size1 = 0, size2 = 0, size3 = 0;
    private int front1 = -1, rear1 = -1;
    private int front2 = -1, rear2 = -1;
    private int front3 = -1, rear3 = -1;

    private final int[][] priorityQueue = new int[3][max];

    public void insert(int value, int priority) {
        if (isFull(priority)) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty(priority)) {
            if (priority == 1) {
                front1++;
                rear1++;
                priorityQueue[priority - 1][rear1] = value;
                size1++;
                return;
            }
            if (priority == 2) {
                front2++;
                rear2++;
                priorityQueue[priority - 1][rear2] = value;
                size2++;
                return;
            }
            if (priority == 3) {
                front3++;
                rear3++;
                priorityQueue[priority - 1][rear3] = value;
                size3++;
                return;
            }

        }

        if (priority == 1) {
            rear1++;
            priorityQueue[priority - 1][rear1] = value;
            size1++;
            return;
        }
        if (priority == 2) {
            rear2++;
            priorityQueue[priority - 1][rear2] = value;
            size2++;
            return;
        }
        if (priority == 3) {
            rear3++;
            priorityQueue[priority - 1][rear3] = value;
            size3++;
            return;
        }


    }

    private boolean isFull(int index) {
        if (index == 1) {
            if (rear1 == max) {
                return true;
            }
        } else if (index == 2) {
            if (rear2 == max) {
                return true;
            }
        } else if (index == 3) {
            if (rear3 == max) {
                return true;
            }
        }

        return false;
    }

    public void remove() {
        if (isEmpty(3)) {
            if (isEmpty(2)) {
                if (isEmpty(1)) {
                    System.out.println("Empty Queue...");
                    return;
                } else {
                    priorityQueue[0][front1] = 0;
                    front1++;
                    size1--;
                }
            } else {
                priorityQueue[1][front2] = 0;
                front2++;
                size2--;
            }
        } else {
            priorityQueue[2][front3] = 0;
            front3++;
            size3--;
        }
    }

    private boolean isEmpty(int index) {
        if (index == 1) {
            if (size1==0) {
                return true;
            }
        } else if (index == 2) {
            if (size2==0) {
                return true;
            }
        } else if (index == 3) {
            if (size3==0) {
                return true;
            }
        }
        return false;
    }

    public void Print() {
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("-----------------Priority 1 -------------");
                int j=front1;
                do{
                    System.out.print(priorityQueue[i][j] + "  ");
                    j++;
                }while (j<size1);
                System.out.println();
            }
            if (i == 1) {
                System.out.println("-----------------Priority 2 --------------");
                int j=front2;
                do{
                    System.out.print(priorityQueue[i][j] + "  ");
                    j++;
                }while (j<size2);
                System.out.println();
            }
            if (i == 2) {
                System.out.println("------------------Priority 3 --------------");
                int j=front3;
                do{
                    System.out.print(priorityQueue[i][j] + "  ");
                    j++;
                }while (j<size3);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.remove();
        System.out.println("\n[INFO] Inserting in Queue...");
        queue1.insert(45, 3);
        queue1.insert(50, 1);
        queue1.insert(57, 1);
        queue1.insert(58, 2);
        queue1.insert(55, 2);
        queue1.insert(60, 3);
        System.out.println("\n[INFO] Printing Queue...");
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();
        System.out.println("\n[INFO] Removing From Queue...");
        queue1.remove();
        queue1.Print();

    }


}
