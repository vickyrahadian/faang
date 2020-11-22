 //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package leetcode;

import java.util.Arrays;

public class Problem26 {

    public static void main(String[] args) {
        int[] angka = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(angka));
        System.out.println(Arrays.toString(angka));
    }

    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;

        for(int n : nums){
            if(n > nums[i - 1]){
                nums[i++] = n;
            }
        }
        
        return i;
    }
}
