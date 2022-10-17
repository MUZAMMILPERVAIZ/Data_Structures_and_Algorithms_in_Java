package Stack_using_Arrays;

public class Stack {
    int top=0;
    int max=5;
    int[] stack= new int[max];

    public void insert(int data){
        if(isFull()){
            return;
        }
        stack[top++] = data;
    }

    public int remove(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }

      return stack[--top];

    }
    public boolean isFull(){
        if(top==max){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.insert(3);
        stack1.insert(4);
        stack1.insert(5);
        stack1.insert(6);
        System.out.println(stack1.remove());
        System.out.println(stack1.remove());
        System.out.println(stack1.remove());


    }
}
