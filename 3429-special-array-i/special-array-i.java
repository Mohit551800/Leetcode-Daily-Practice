class Solution {
    public boolean isArraySpecial(int[] nums) {
        int low = 0;
        int high = 1;
        while(high<=nums.length-1){
            if(nums[low]%2==0 && nums[high]%2==0){
                return false;
            }
            else if(nums[low]%2!=0 && nums[high]%2!=0){
                return false;
            }
            low++;
            high++;
        }
        

        
        return true;
        
    }
}