package lc;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            res[0]=i;
            for(int j=i+1;j<nums.length;j++){
                res[1]=j;
                if(nums[i]+nums[j]==target)
                    return res;
            }
        }
        return null;
    }
}
