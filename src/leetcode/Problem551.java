package leetcode;

import java.util.HashMap;

public class Problem551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("LL"));

    }

    public static boolean checkRecord(String s) {
        if (s.length() >= 0) {

            HashMap<Character, Integer> map = new HashMap<>();
            map.put('L', 0);
            map.put('P', 0);
            map.put('A', 0);
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }


                if (i >= 2) {
                    if (c == 'L' && s.charAt(i - 1) == 'L' & s.charAt(i - 2) == 'L') {
                        return false;
                    }
                }

                if(map.get('A') >= 2){
                    return false;
                }

            }

            return true;

        } else {
            return false;
        }
    }
}


//https://leetcode.com/problems/student-attendance-record-i/