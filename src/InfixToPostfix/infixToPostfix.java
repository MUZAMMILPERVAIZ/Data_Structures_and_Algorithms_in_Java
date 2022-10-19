package InfixToPostfix;

import Stack_using_Arrays.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String expression = "((A+B)/(B-D))";
        System.out.println(infixToPostfix(expression));
        String expression1 = "((A+B)/((7-9)*(A-6)))";
        System.out.println(infixToPostfix(expression1));
    }
    public static String infixToPostfix(String expression){
        Stack<Character> operator = new Stack<Character>();
        Stack<String> output = new Stack<String>();
        String result="";
        for (int i = 0; i <expression.length() ; i++) {
            char element = expression.charAt(i);
            if(element=='('){
                operator.insert(element);
            } else if (Character.isLetterOrDigit(element)) {
                //output.insert(String.valueOf(element));
                result = result+String.valueOf(element);
            } else if ((element=='+')||(element=='-')||(element=='*')||(element=='/')||((element=='%')) ) {
                operator.insert(element);
            } else if (element==')') {
                for(int j = 0; j < operator.Size(); j++) {
                    element = operator.remove();
                    if(element=='('){
                        break;
                    }
                    else {
                   //     output.insert(String.valueOf(element));
                        result = result+String.valueOf(element);

                    }
                }
            }
        }
//
//        for (int i = 0; i < output.Size(); i++) {
//            System.out.println(output.remove());
//        }
        return result;

    }

}

