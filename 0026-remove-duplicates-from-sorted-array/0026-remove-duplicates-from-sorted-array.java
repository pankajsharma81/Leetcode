class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1;

        int n = nums.length;

        while(j<n){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j++];
            }else{
                j++;
            }
        }

        return i+1;
    }
}