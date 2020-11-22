//https://leetcode.com/problems/implement-strstr/
package leetcode;

public class ImplementstrStr {

    public static void main(String[] args) {
        String haystack = "helloworld";
        String needle = "ll";
        System.out.println(Solution28.strStr(haystack, needle));
    }
}

class Solution28 {

    public static int strStr(String haystack, String needle) {
        int point_a = -1;

        if (haystack.equalsIgnoreCase("")) {
            point_a = -1;
        }

        if (needle.equalsIgnoreCase("")) {
            point_a = 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            System.out.print(haystack.charAt(i));

        }

        return point_a;
    }
}
