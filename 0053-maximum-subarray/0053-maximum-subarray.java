class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        boolean flag=true;
        int maxe=Integer.MIN_VALUE;
        
        for (int i=0;i<nums.length;i++){
            maxe=Math.max(maxe,nums[i]);
            if(nums[i]>0) flag=false;
            if(i==nums.length-1 && flag==true) return maxe;
            cs+=nums[i];
            if(cs<0) cs=0;
            ms=Math.max(cs,ms);
        }
        return ms;
    }
}