package Arrays_And_Strings;

/**
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle within haystack. If needle is not present, return -1.
 *
 * -----------------------------------------------------------
 * Example 1:
 * Input:  haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation:
 *     The substring "sad" appears at index 0 and 6.
 *     The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 * Input:  haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation:
 *     The substring "leeto" does not occur in "leetcode".
 *     Therefore, the function returns -1.
 * -----------------------------------------------------------
 */

public class FirstIndexMatchString {

    static void main() {
        String haystack = "sadbutsad", needle = "sad" ;
        int returnValue =strStr(haystack, needle);
        System.out.println(returnValue);
        int returnValue2 = strSecondMethod(haystack, needle);
        System.out.println(returnValue2);
    }


    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int strSecondMethod(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Loop through all possible starting positions in haystack
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            //Compare haystack[i] with needle[0]
            //Compare haystack[i+1] with needle[1]
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all characters of needle, return starting index
            if (j == m) return i;
        }
        return -1; // Needle not found
    }
}


