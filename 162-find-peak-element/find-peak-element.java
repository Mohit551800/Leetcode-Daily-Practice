class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        if(nums.length==1){
            return 0;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }
        
        
        for(i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
           
                return i;
           
                
            }

        }
        return nums.length-1;
        
    }
}