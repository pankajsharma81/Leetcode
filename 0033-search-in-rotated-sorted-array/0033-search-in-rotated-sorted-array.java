class Solution {
    public int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    // Helper function for recursion
    public int search(int[] arr, int target, int st, int en) {
        if (st > en) {
            return -1;  // Target not found
        }

        int mid = st + (en - st) / 2;

        // Check if mid element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Determine which side is sorted
        if (arr[st] <= arr[mid]) {  // Left side is sorted
            if (arr[st] <= target && target <= arr[mid]) {
                return search(arr, target, st, mid - 1);  // Search in the left side
            } else {
                return search(arr, target, mid + 1, en);  // Search in the right side
            }
        } else {  // Right side is sorted
            if (arr[mid] <= target && target <= arr[en]) {
                return search(arr, target, mid + 1, en);  // Search in the right side
            } else {
                return search(arr, target, st, mid - 1);  // Search in the left side
            }
        }
    }
}
