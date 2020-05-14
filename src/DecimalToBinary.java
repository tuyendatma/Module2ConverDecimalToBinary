import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        int num =1;
        while (num != 0){
            stack.push(String.valueOf(num%2));
            num = num/2;
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
