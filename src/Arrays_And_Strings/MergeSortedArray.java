package Arrays_And_Strings;

import java.util.Arrays;

/**
 * Merges two sorted integer arrays nums1 and nums2 into a single sorted array in non-decreasing order.
 * <p>
 * The merged result is stored in nums1. The array nums1 has a length of m + n, where the first
 * m elements represent the valid values to be merged, and the last n elements are placeholders (0)
 * that should be overwritten during merge. The array nums2 has exactly n valid elements.
 * <p>
 * Both nums1 and nums2 are assumed to be sorted in non-decreasing order. After merging, nums1
 * will contain all m + n elements in sorted order.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output:
 * nums1 = [1,2,2,3,5,6]
 *
 * @param nums1 the first array with length m + n, where first m values are valid
 * @param m     number of valid elements in nums1
 * @param nums2 the second array with n elements
 * @param n     number of valid elements in nums2
 */


public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 6, 7};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        mergeWithAnotherApproach(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: Copy nums2 into nums1 (after m elements)
        if (n >= 0)
            System.arraycopy(nums2, 0, nums1, m, n);

        /* or
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        */

        // Step 2: Sort nums1
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }


    // ------------- Another approach ---------
    public static void mergeWithAnotherApproach(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int i = m - 1;  // last valid element in nums1
        int j = n - 1;  // last element in nums2
        int pos = m + n - 1; // last position in nums1

        // Compare elements from both arrays and put larger one at the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[pos] = nums1[i];
                i--;
            } else {
                nums1[pos] = nums2[j];
                j--;
            }
            pos--;
        }

        // If nums2 still has elements, copy them over
        // (No need to check nums1 since those are already in place)
        while (j >= 0) {
            nums1[pos] = nums2[j];
            j--;
            pos--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}



