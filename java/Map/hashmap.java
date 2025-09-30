import java.util.*;

class hashmap{
    public static void main(String arg[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        System.out.println(map);
        System.out.println(map.get(2));
        map.remove(3);
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("D"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
    }
}