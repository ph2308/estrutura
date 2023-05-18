package questao3;
import java.util.Stack;

public class main{
    public static void main (String[] args) {
Stack <Integer> stack = new Stack <> ();
stack.pop(5);
stack.pop(4);
stack.pop(3);
stack.pop(2);
for (int c= 0; c <5; c++){
    System.out.println(stack.peek());
stack.pop();
        }
    }
}