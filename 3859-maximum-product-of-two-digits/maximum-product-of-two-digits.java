class Solution {
    public int maxProduct(int n) {
       
        int fmax = 0;
        int smax = 0;

        while(n!=0){
            int res = n%10;
            if(res>fmax){
                smax=fmax;
                fmax = res;

            }
            else if(res>smax){
                smax=res;

            }
           
            n=n/10;

        }
        return smax*fmax;
        
    }
}