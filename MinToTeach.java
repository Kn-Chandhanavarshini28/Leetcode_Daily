class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Map<Integer, List<Integer>> s=new HashMap<>();
        for(int i=0;i<languages.length;i++){
            List<Integer> se=new ArrayList<>();
            for(int g:languages[i]){
                se.add(g);
            }
            s.put(i+1,se);  
        }
        List<int[]> b=new ArrayList<>();
        for(int[] f:friendships){
            int f1=f[0];
            int f2=f[1];
            if(!canCom(s.get(f1), s.get(f2))){
                b.add(f);
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int[] g:b){
            set.add(g[0]);
            set.add(g[1]);
        }
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int c=0;
            for(int u:set){
                if(!s.get(u).contains(i)) c++;
            }
            mini=Math.min(mini, c);
        }
        return mini==Integer.MAX_VALUE ? 0: mini;
        
    }
    private boolean canCom(List<Integer> l1, List<Integer> l2) {
        for (int a : l1) {
            if (l2.contains(a)) return true;
        }
        return false;
    }
}