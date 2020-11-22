/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import static hackerrank.SalesByMatch.sockMerchant;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author vicky
 */
public class CountingValleys {

    public static void main(String[] args) throws IOException {
        int result = countingValleys(8, "UDDDUDUU");
        System.out.println(result);
    }
    

    public static int countingValleys(int steps, String path) {
        int countValleys = 0;
        int position = 0;
        
        if(path.length() <= 1){
            return 0;
        }

        for (int i = 0; i < path.length(); i++) {
            System.out.print(path.charAt(i));
            if(path.charAt(i) == 'U'){
                if(position == -1){
                    countValleys++;
                }
                position++;
            } else if(path.charAt(i) == 'D'){
                position--;
            }
            System.out.println(position);
        }
        
        return countValleys;
    }
}
