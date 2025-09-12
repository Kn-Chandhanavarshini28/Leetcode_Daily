class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>m=new ArrayList<>();
        int[] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(curr[1]>=intervals[i][0]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }
            else{
                m.add(curr);
                curr=intervals[i];
            }
        }
        m.add(curr);
        return m.toArray(new int[m.size()][]);

        
    }
}