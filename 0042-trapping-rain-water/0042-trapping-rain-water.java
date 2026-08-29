class Solution {
    public int trap(int[] height) {
        int mw=0;
        int[] lm=new int[height.length];
        int[] rm=new int[height.length];
        lm[0]=height[0];
        rm[height.length-1]=height[height.length-1];
        for (int i = 1; i < rm.length; i++) {
            lm[i]=Math.max(height[i], lm[i-1]);
        }
        for (int i = rm.length-2; i >=0; i--) {
            rm[i]=Math.max(height[i], rm[i+1]);
        }
        for (int i = 0; i < height.length; i++) {
            int cw=Math.min(rm[i], lm[i])-height[i];
            if (cw>0) {
                mw+=cw;
            } else {
                mw+=0;
            }
            
        }

        return mw;
    }
}