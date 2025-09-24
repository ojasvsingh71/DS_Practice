import java.util.*;

class stk{
    public static void main(String []arg){
        Stack<Integer> chonchu=new Stack<>();
        chonchu.push(50);
        chonchu.push(50);
        chonchu.push(20);
        chonchu.push(60);
        chonchu.push(10);
        System.out.println(chonchu);
        chonchu.pop();
        System.out.println(chonchu);
        System.out.println(chonchu.peek());
    }
}