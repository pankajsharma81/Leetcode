class Solution {
    public void moveZeroes(int[] nums) {
        //index of first place that is not taken yet for non zero elements
        int j = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            //if not a zero then place it in most soon location
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        //filling rest as zeros
        for(int i = j;i<n;i++){
            nums[i] = 0;
        }
    }
}