import java.util.Stack;
 
public class Postfix_calculator {
    static int evaluatePostfix(String exp) {
        //create a stack using built in stack
        Stack<Integer> stack=new Stack<>();
        /*create a stack using your own stack
        StackX stack = new StackX(10);*/
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++) {
            char c=exp.charAt(i);
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
               stack.push(c - '0');
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(c) {
                    case '+':   stack.push(val2+val1);
                                break;
                    case '-':   stack.push(val2- val1);
                                break;
                    case '/':   stack.push(val2/val1);
                                break;
                    case '*':   stack.push(val2*val1);
                                break;
                }
            }
        }
        return stack.pop();    
    }
    // Driver program to test above functions
    public static void main(String[] args) {
        String exp="246*+88/-8+";
        System.out.println(evaluatePostfix(exp));
    }
}