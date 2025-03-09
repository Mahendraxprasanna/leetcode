class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int x=colors.length;
        int res=0;
        int left=0;
        for(int right=1;right<x+k-1;right++){
            if(colors[right%x]==colors[(right-1)%x]){
                left=right;
            }
            if((right-left+1)==k){
                res++;
                left++;
            }
        }
        return res;

        
    }
}