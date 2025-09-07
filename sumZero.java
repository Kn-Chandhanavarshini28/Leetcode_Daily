class Solution {
    public int[] sumZero(int n) {
        int[] r=new int[n];
        int o=0;
        int e=n/2;
        if(n%2!=0){
            r[o++]=0;
        }
        for(int i=1;i<=e;i++){
            r[o++]=i;
            r[o++]=-i;

        }
        return r;
        
    }
}
