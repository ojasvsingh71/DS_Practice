import java.util.*;

class main{
    public static void main(String arg[]){
        List<String> students=new ArrayList<String>();

        students.add("Ms chonchu");
        students.add("Mr chonchu");
        students.add("Ms panda");

        students.remove("Mr chonchu");
        System.out.println(students.indexOf("Ms chonchu"));

        ListIterator<String> itr=students.listIterator();

        for(String s:students){
            System.out.print(s+"\t");
        }
        Arrays.sort(students);
        for(String s:students){
            System.out.print(s+"\t");
        }
        
        System.out.println();
    }
}