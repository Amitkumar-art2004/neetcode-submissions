class Solution {
    public void sortColors(int[] nums) {
        int noOfzeros = 0;
        int noOfOnce = 0;
        for(int num : nums){
            if(num == 0){
                noOfzeros++;
            }else if(num == 1){
                noOfOnce++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<noOfzeros){
                nums[i] = 0;
            }else if(i<noOfzeros+noOfOnce){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}