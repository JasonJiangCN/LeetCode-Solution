public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getkth(nums1, 0, nums2, 0, l) + getkth(nums1, 0, nums2, 0, r)) / 2.0;
        
    }
    public double getkth(int[] a, int aCurr, int[] b, int bCurr, int k) {
        
        if (k == 1)
            return Math.min(a[])
    }
}


