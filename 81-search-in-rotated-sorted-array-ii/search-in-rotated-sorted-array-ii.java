class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            if(nums[low]==target){
                return true;
            }
            else if(nums[high]==target){
                return true;

    
            }
            low++;
            high--;
        }
        return false;
        
    }
}