package euler;

import java.util.LinkedList;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
//        primeFactor(8);
        System.out.println(primeFactorRec(24, 2));
    }

    public static void primeFactor(double number) {
        for (int counter = 2; number > 1; counter++) {
            while (number % counter == 0) {
                number = number / counter;
                System.out.println(counter);
            }
        }
    }

    public static List<Integer> primeFactorRec(int number, int iterator) {
        if (number <= 2) {
            return new LinkedList<>();
        } else if (number % iterator == 0) {
            List<Integer> list = primeFactorRec(number / iterator, iterator);
            list.add(0, iterator);
            return list;
        } else {
            return primeFactorRec(number, iterator + 1);
        }
    }

}

//faktor(24)
//2 + faktor(12) 
//2 + 2 + faktor(6)
//2 + 2 + 2 + faktor(3)
