class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Temporary array to store the result
        int[] res = new int[m + n];
        
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for res
        
        // Merge arrays while both pointers are within bounds
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            res[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            res[k] = nums2[j];
            j++;
            k++;
        }

        // Copy the result back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = res[x];
        }
    }
}
