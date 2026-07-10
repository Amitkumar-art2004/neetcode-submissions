class Solution {
    public void moveZeroes(int[] nums) {
        int ele = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[ele] = nums[i];
                ele++;
            }
        }
        while(ele < nums.length){
            nums[ele] = 0;
            ele++;
        }
    }
}