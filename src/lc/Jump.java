package lc;

public class Jump {
	public int jump(int[] nums) {
        int len=nums.length-1;
        int start=0;
        int nxt=-1;
        int count=0;
        while(start<len){
            int max=-1;
            for(int i=start;i<=start+nums[start];i++){
                if(i==len){
                    return ++count;
                }
                if(i+nums[i]>=max){
                    max=i+nums[i];
                    nxt=i;
                }
            }
            start=nxt;
            count++;
        }
        return count;
    }
}
