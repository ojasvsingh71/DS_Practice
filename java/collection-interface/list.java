import java.util.*;

class chonchu{
    public static void main(String[] arg){
        List<String> ms_chonchu=new ArrayList<String>();
        ms_chonchu.add("very");
        ms_chonchu.add("angry");
        ms_chonchu.add("chonchu");

        System.out.println(ms_chonchu);

        for(String s: ms_chonchu){
            System.out.print(s+"\t");
        }System.out.println();

        ListIterator<String> itr=ms_chonchu.listIterator(ms_chonchu.size());

        // while(itr.hasNext()){
        //     System.out.print(itr.next()+"\t");
        // }
        // System.out.println();

        while(itr.hasPrevious()){
            System.out.print(itr.previous()+"\t");
        }
        System.out.println();


    }
}