package lc;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        for (int i = nums.length/2-1; i >=0 ; i--) {
            adjustHeap(nums,i,nums.length);
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            adjustHeap(nums,0,i);
        }
        return nums[k-1];
    }
    public void adjustHeap(int[] nums,int start,int end){
        int temp=nums[start];
        for (int i = 2*start+1; i <end ; i=2*i+1) {
            if(i+1<end&&nums[i]<nums[i+1])i++;
            if(nums[i]>temp){
                nums[start]=nums[i];
                start=i;
            }else{
                break;
            }
        }
        nums[start]=temp;
    }
}
