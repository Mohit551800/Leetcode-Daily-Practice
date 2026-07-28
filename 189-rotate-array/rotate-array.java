class Solution {
    public void rotate(int[] nums, int k) {
        int index = 0;
        int n = nums.length;
        k=k%n;
        int arr[]=nums.clone();
        for(int i=nums.length-k;i<nums.length;i++){
            nums[index]=nums[i];
            index++;


        }
        for(int i=0;i<arr.length-k;i++){
            nums[index]=arr[i];
            index++;
        }
       
    }
}