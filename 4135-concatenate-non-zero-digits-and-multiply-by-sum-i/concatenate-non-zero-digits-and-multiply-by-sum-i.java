class Solution {
    public long sumAndMultiply(int n) {
        String num = String.valueOf(n);
        StringBuilder s = new StringBuilder();
        int sum = 0;
       
        
        for(char ch:num.toCharArray()){
            if(ch!='0'){
                s.append(ch);
                sum+=(ch-'0'); 

            }
        
        }
        if(s.length()==0){
            return 0L;
        }

        Long x = Long.parseLong(s.toString());

        return x*sum;
        
    }
}