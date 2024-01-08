class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        int[] ans = new int[total];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n2) {
            ans[k] = nums2[j];
            j++;
            k++;
        }

        if (total % 2 == 0) {
            return (ans[total / 2 - 1] + ans[total / 2]) / 2.0;
        } else {
            return ans[total / 2];
        }
    }
}
