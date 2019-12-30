package lc;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        int n=nums.length;

        int[] bucketMax=new int[n-1];
        int[] bucketMin=new int[n-1];
        Arrays.fill(bucketMax,-1);
        Arrays.fill(bucketMin,Integer.MAX_VALUE);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int bucketSize=(max-min)/(nums.length-1)+1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max||nums[i]==min)continue;
            int bucketIndex=(nums[i]-min)/bucketSize;
            bucketMax[bucketIndex]=Math.max(nums[i],bucketMax[bucketIndex]);
            bucketMin[bucketIndex]=Math.min(nums[i],bucketMin[bucketIndex]);
        }
        int maxGap=0;
        int preValue=min;
        for (int i = 0; i < n-1; i++) {
            if(bucketMax[i]==-1)continue;
            maxGap=Math.max(maxGap,bucketMin[i]-preValue);
            preValue=bucketMax[i];
        }
        maxGap=Math.max(maxGap,max-preValue);
        return maxGap;
    }
}
