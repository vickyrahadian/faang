//https://leetcode.com/problems/remove-element/
package leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        Solution27 s27 = new Solution27();
        int[] angka = {3, 2, 2, 3}; 
        System.out.println(s27.removeElement(angka, 3));
    }
}

class Solution27 {

    public int removeElement(int[] nums, int val) {
        int point_a = 0;
        for (int point_b = 0; point_b < nums.length; point_b++) {
            if (nums[point_b] != val) {
                nums[point_a] = nums[point_b];
                point_a++;
            }
        }
        return point_a;
    }
}
