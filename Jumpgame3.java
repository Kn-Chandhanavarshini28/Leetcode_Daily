class Solution {
    public boolean canReach(int[] arr, int start) {
        int s =start;
       if (s<0||  s>=arr.length || arr[s]<0){
        return false;
       }
       if(arr[s]==0){
        return true;
       }
       int j=arr[s];
       arr[s]= -arr[s];
       return canReach(arr, s-j) || canReach(arr, s+j);
        
    }
}