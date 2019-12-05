package lc;

public class Canjump {
    public boolean canJump(int[] nums) {
        int now=0,nxt=-1;
        while(now<nums.length-1){
            int max=-1;
            for(int i=now;i<=now+nums[now];i++){
                if(i==nums.length-1){
                    return true;
                }
                if(i+nums[i]>=max) {
                    max = nums[i]+i;
                    nxt = i;
                }
            }
            if(nums[nxt]==0){
                return false;
            }
            now=nxt;
        }
        return true;
    }
}
