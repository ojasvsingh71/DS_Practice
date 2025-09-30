import java.util.*;

class chonchu{
    public static void main(String []arg){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(8);
        pq.add(4);
        pq.add(1);
        pq.add(10);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}