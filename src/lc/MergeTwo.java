package lc;

public class MergeTwo {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            int j=0;
            while(nums2[i]>=nums1[j]&&j<m+i){
                j++;
            }
            for(int k=nums1.length-2;k>=j;k--){
                nums1[k+1]=nums1[k];
            }
            nums1[j]=nums2[i];
        }
    }

    public static void main(String[] args) {
        MergeTwo m=new MergeTwo();
        int[] nums1={-1,0,0,3,3,3,0,0,0};
        int[] nums2={1,2,2};
        m.merge(nums1,6,nums2,3);
    }
}
