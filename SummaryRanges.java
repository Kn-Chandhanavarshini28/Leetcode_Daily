class Solution {
    List<String> h = new ArrayList<>(); 
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return h;
        List<Integer> s = new ArrayList<>();
        s.add(nums[0]); 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                s.add(nums[i]);
            } else {
                func(s);
                s.clear();
                s.add(nums[i]); 
            }
        }
        func(s);
        return h;
    }
    private void func(List<Integer> f) {
        if (f.size() == 1) {
            h.add(String.valueOf(f.get(0)));
        } else {
            h.add(f.get(0) + "->" + f.get(f.size() - 1));
        }
    }
}

