package lc;

public class SortColor {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0)return;
        int red=0;
        int white=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)++red;
            else if(nums[i]==1)++white;
        }
        for(int i=0;i<red;i++){
            nums[i]=0;
        }
        for(int i=red;i<red+white;i++){
            nums[i]=1;
        }
        for(int i=red+white;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
