class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int f=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                o++;
            }
            else{
                f=Math.min(f+1,o);


            }
        }
        return f;
    }
}
