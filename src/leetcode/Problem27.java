//https://leetcode.com/problems/remove-element/
package leetcode;

import java.util.Arrays;

public class Problem27 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] angka = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(s.removeElement(angka, 2));
        System.out.println(Arrays.toString(angka));
    }
}

class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if(nums[i] == val){
                nums[i] = nums[i + 1];
                total++;
            }
        }
        
        return total;
    }
}
