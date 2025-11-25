package Arrays_And_Strings;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place so that each unique element appears only once.
 * The relative order of the elements must remain the same.
 *
 * After removing duplicates, return the number of unique elements k.
 *
 * Requirements:
 * 1. The first k elements of nums must contain all unique values in sorted order.
 * 2. Elements beyond index k - 1 can be ignored (their values do not matter).
 * -----------------------------------------------------------
 * Example 1:
 * Input:  nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation:
 *     Unique elements are 1 and 2.
 *     Function returns k = 2.
 *     The array’s first two positions must contain [1, 2].
 *
 * Example 2:
 * Input:  nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation:
 *     Unique values are [0,1,2,3,4].
 *     Function returns k = 5.
 *     The first five elements must contain these values in sorted order.
 *     Remaining elements do not matter.
 * -----------------------------------------------------------
 */

public class RemoveDupEleSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 4};
        int uniqueNum = removeDuplicates(nums1);
        System.out.println(uniqueNum);
    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
