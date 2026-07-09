class Solution {
    public int Min(int []nums,int left,int right,int min)
    {
        if(nums[left]<nums[right]){
            return nums[left];
        }
        if(nums[left]==nums[right]){
            return nums[left];
        }

        int mid = (left+right)/2;

        if(nums[mid]>nums[right]){
            left = mid+1;
            min = nums[right];
            return Min(nums, left, right, min);
        }
        else {
            min =nums[mid];
            right = mid;
            return Min(nums, left, right, min);
            

        }
    }
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = Integer.MAX_VALUE;
        return Min(nums, left, right, min);
    }
}