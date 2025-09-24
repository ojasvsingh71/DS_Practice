import java.util.*;

class linkis{
    public static void main(String []arg){
        LinkedList<Integer> chonchu=new LinkedList<>();
        chonchu.add(50);
        chonchu.add(50);
        chonchu.add(20);
        chonchu.add(60);
        chonchu.add(10);
        System.out.println(chonchu);
        chonchu.remove("10");
        System.out.println(chonchu);
    }
}