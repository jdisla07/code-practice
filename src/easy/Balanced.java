package easy;
import java.util.Stack;

public class Balanced {
   public static boolean isBalanceSequence(String sequence) {
       Stack<Character> stack = new Stack<>();
       boolean isBalance = true;
       for(char c: sequence.toCharArray()){
           if(c == '(' || c == '[' || c == '{'){
               stack.push(c);
           }else{
               if(c == ')'){
                   c = '(';
               }
              else if( c == '}'){
                   c = '{';
               }
              else if(c == ']'){
                   c = '[';
               }
               if(stack.isEmpty()){
                   return false;
               }
               if(c == stack.peek()){
                   stack.pop();
               }else{
                   return false;
               }
           }
       }
       if(!stack.isEmpty()){
           isBalance = false;
       }
       return isBalance;
    }
    public static void main(String[] args) {
        System.out.println(isBalanceSequence("()"));
    }
}
