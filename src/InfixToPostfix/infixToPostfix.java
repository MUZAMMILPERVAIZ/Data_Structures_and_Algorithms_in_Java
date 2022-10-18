package InfixToPostfix;

import Stack_using_Arrays.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String expression = "((A+B)/((B-D))";
        Stack<Character> operator = new Stack<Character>();
        Stack<String> output = new Stack<String>();
        int index=0;

        for (int i = 0; i <expression.length() ; i++) {
            char element = expression.charAt(i);
            if(element=='('){
                operator.insert(element);
            } else if (Character.isLetterOrDigit(element)) {
                output.insert(String.valueOf(element));
                index++;
            } else if ((element=='+')||(element=='-')||(element=='*')||(element=='/')||((element=='%')) ) {
                operator.insert(element);
            } else if (element==')') {
                for(int j = 0; j < operator.Size(); j++) {
                   element = operator.remove();
                   if(element=='('){
                       break;
                   }
                   else {
                       output.insert(String.valueOf(element));
                       index++;
                   }
                }
            }
        }

        for (int i = 0; i < output.Size(); i++) {
            System.out.println(output.remove());
        }
    }
}

