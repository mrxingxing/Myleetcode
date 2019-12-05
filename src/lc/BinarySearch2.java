package lc;

public class BinarySearch2 {

    public boolean search(int[] nums,int target){
        if(nums.length==0)return false;
        if(nums.length==1)return nums[0]==target;
        int rotated = rotationIndex(nums,0,nums.length-1);
        System.out.println(rotated);
        if(rotated==-1){
            return binarySearch(nums,0,nums.length-1,target);
        }else{
            if(nums[rotated]==target){
                return true;
            }else{
                return binarySearch(nums,0,rotated-1,target)||binarySearch(nums,rotated+1,nums.length-1,target);
            }
        }
    }
    private int rotationIndex(int[] nums,int low,int high){
        if(nums[low]<nums[high])return -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                low++;
            }else{
                high--;
            }
        }
        return -1;
    }
    private boolean binarySearch(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,2,2,0};
        int target=0;
        BinarySearch2 b=new BinarySearch2();
        if(b.search(nums,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
