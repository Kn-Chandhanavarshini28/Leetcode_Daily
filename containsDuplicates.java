class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> s=new HashMap<>();
        for(int num:nums){
            if(s.containsKey(num)){
                return true;
            }
            else{
                s.put(num,1);
            }
        }
        return false;
    }
}
