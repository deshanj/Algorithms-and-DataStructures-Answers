import java.util.Arrays;

/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/

public class MedianofTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        double median;
        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            mergedArray[j + nums1.length] = nums2[j];
        }
        Arrays.sort(mergedArray);
        if ((mergedArray.length % 2) == 0) {
            median = (mergedArray[(mergedArray.length / 2) - 1] + mergedArray[(mergedArray.length / 2)]) / 2.0;
        } else {
            median = (mergedArray[(mergedArray.length / 2)]);
        }
        return median;
    }
}
