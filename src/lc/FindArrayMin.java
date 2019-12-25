package lc;

public class FindArrayMin {
    public int findMin(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        int left=0;
        int right=nums.length-1;
        if(nums[left]<nums[right])return nums[left];
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[right]){
                right=mid;
            }else if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}
