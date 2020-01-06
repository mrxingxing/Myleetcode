package lc;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){
            if(nums2.length%2==0){
                return (double)(nums2[nums2.length/2]+nums2[nums2.length/2-1])/2;
            }else{
                return (double)nums2[nums2.length/2];
            }
        }else if(nums2.length==0){
            if(nums1.length%2==0){
                return (double)(nums1[nums1.length/2]+nums1[nums1.length/2-1])/2;
            }else{
                return (double)nums1[nums1.length/2];
            }
        }
        if((nums1.length+nums2.length)%2==0){
            return (findMid(nums1,0,nums2,0,(nums1.length+nums2.length)/2+1)+findMid(nums1,0,nums2,0,(nums1.length+nums2.length)/2))/2.0;
        }else{
            return findMid(nums1,0,nums2,0,(nums1.length+nums2.length)/2+1);
        }
    }
    public double findMid(int[] nums1,int start1,int[] nums2,int start2,int n){
        if(start1>=nums1.length)return nums2[start2+n-1];
        if(start2>=nums2.length)return nums1[start1+n-1];
        if(n==1)return Math.min(nums1[start1],nums2[start2]);
        int mid1=Integer.MAX_VALUE;
        int mid2=Integer.MAX_VALUE;
        if(start1+n/2-1<nums1.length){
            mid1=nums1[start1+n/2-1];
        }
        if(start2+n/2-1<nums2.length){
            mid2=nums2[start2+n/2-1];
        }
        if(mid1<mid2){
            return findMid(nums1,start1+n/2,nums2,start2,n-n/2);
        }else{
            return findMid(nums1,start1,nums2,start2+n/2,n-n/2);
        }
    }
}
