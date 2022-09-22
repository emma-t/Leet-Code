class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        
        int[] res = new int[m];
        
        int[] totals = new int[m];
        Arrays.fill(totals, 0);
        
        List<Integer> groups = new ArrayList<Integer>();
        
        for(int i = 0; i < m; i++){
            res[i] = i;
            for(int x = 0; x < n; x++){
                if(mat[i][x] == 1){
                    totals[i] += 1;
                }
            }
        }
        
        for(int x = 0; x < n+1; x++){
            for(int i = 0; i < m; i++){
                
                if(totals[i] == x){
                    groups.add(res[i]);
                }
                
            }
            
        }
        
        int[] ret = new int[k];
        for (int i = 0; i < ret.length; i++){
            ret[i] = groups.get(i).intValue();
        }
        
        return ret;
    }
}

//Runtime: 3 ms, faster than 68.91% of Java online submissions for The K Weakest Rows in a Matrix.
//Memory Usage: 48.5 MB, less than 74.36% of Java online submissions for The K Weakest Rows in a Matrix.
