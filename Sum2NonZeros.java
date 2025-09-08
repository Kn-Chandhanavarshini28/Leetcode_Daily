class Solution {
    private boolean check(int d){
            
            while(d>0){
                int f=d%10;
                if(f==0) return false;
                d/=10;
            }
            return true;
            
        }
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        
      
     
        for(int i=1;i<n;i++){
            int  s=i;
            int b=n-i;

            if(s+b ==n && s>0 && b>0 && check(s) && check(b)){
                res[0]=s;
                res[1]=b;
                return res;
            }

        }
        return res;
    }
}