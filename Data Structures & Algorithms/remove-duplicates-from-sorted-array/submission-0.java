class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int noOfUnique = 1;
        while(j<= nums.length-1){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
                j++;
                noOfUnique++;
            }
        }
        return noOfUnique;
    }
}