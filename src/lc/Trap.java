package lc;

public class Trap {
    public int trap(int[] height) {
        if(height.length<3)return 0;
        int leftP=1,rightP=height.length-2;
        int sum=0;
        int lmax=0,rmax=0;
        for (int i = 1; i < height.length-1; i++) {
            if(height[leftP-1]<height[rightP+1]){
                lmax=Math.max(lmax,height[leftP-1]);
                if(lmax>height[leftP])
                    sum+=lmax-height[leftP];
                leftP++;
            }else{
                rmax=Math.max(rmax,height[rightP+1]);
                if(rmax>height[rightP])
                    sum+=rmax-height[rightP];
                rightP--;
            }
        }
        return sum;
    }
}
