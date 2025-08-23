public class Q2{
    public static void main(String []args){
        int odd_sum=0,odd_count=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0) {
                odd_count++;
                odd_sum+=i;
            }
        }
        System.out.println("Total odd number between 1 to 100 are : "+odd_count);
        System.out.println("Total odd sum between 1 to 100 are : "+odd_sum);
        System.out.println("Ojasv Singh\n202401100500120");
    }
}