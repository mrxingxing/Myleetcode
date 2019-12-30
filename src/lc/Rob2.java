package lc;

public class Rob2 {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp[0] =nums[0];
        dp[1] = nums[0];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for (int i = 2; i < nums.length-1; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            dp2[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        dp[nums.length-1]=dp[nums.length-2];
        dp2[nums.length-1]=Math.max(dp2[nums.length-2],dp2[nums.length-3]+nums[nums.length-1]);

        return Math.max(dp[nums.length-1],dp2[nums.length-1]);
    }
}
