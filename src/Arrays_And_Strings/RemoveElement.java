package Arrays_And_Strings;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val
 * from the array in-place. The order of elements may change.
 *
 * After removal, return the number of elements in nums that are NOT equal to val.
 *
 * Let the count of elements not equal to val be k. To get accepted:
 *
 * 1. Modify nums such that the first k elements contain all values not equal to val.
 * 2. The remaining elements beyond index k do not matter (can be anything).
 * 3. Return k.
 *
 * -----------------------------------------------------------
 * Example 1:
 * Input:  nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation:
 *     The function returns k = 2.
 *     The first two elements of nums must be 2 and 2.
 *     Values beyond index 2 are irrelevant.
 *
 * Example 2:
 * Input:  nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation:
 *     The function returns k = 5.
 *     The first five elements can be [0,1,4,0,3] in any order.
 *     Remaining values do not matter.
 * -----------------------------------------------------------
 */

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        removeElement(nums, k);
    }

    public static void removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
                System.out.println(nums[i]);
            }
        }
    }
}
