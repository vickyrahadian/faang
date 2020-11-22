package euler;

//https://projecteuler.net/problem=1

public class Problem1 {
    public static void main(String []args){ 
        int total = 0;
        int limit = 1000;
        for(int i = 0 ; i < limit; i++){
            if(i % 3 == 0 || i % 5 == 0){
                total += i;
            }
        }
        System.out.println(total);
     }
}
