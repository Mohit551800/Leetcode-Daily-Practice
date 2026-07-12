class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] ans = arr.clone();

        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],map.size()+1);
        }
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(ans[i]);
           
           

        }return ans;

        
    }
}