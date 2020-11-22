package hackerrank;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        if (ar.length <= 1) {
            return count;
        }

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < ar.length; i++) {
            if (set.contains(ar[i])) {
                count++;
                set.remove(ar[i]);
            } else {
                set.add(ar[i]);
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        int n = 5;
        int[] ar = {1, 2, 1, 2, 1, 3, 2};
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
