class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            int area = 0;
            int bre = Math.abs(right - left);
            int hei = Math.min(height[right], height[left]);
            area = bre * hei;
            max = Math.max(area, max);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}