package Stack_using_Arrays;

import java.lang.reflect.Type;

public class Stack<T> {
    int top=0;
    int max=15;

    private int size=0;
    T[] stack= (T[])new Object[max];

    public void insert(T data){
        if(isFull()){
            return;
        }
        stack[top++] = data;
        size++;
    }

    public T remove(){
        if(isEmpty()){
            System.out.println("No element found");
        }
      size--;
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
    public int Size(){
        return size;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.insert(3);
        stack1.insert(4);
        stack1.insert(5);
        stack1.insert(6);
        System.out.println(stack1.remove());
        System.out.println(stack1.remove());
        System.out.println(stack1.remove());


    }
}
