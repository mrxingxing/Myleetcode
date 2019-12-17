package lc;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int longest=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int curNum=i;
                int curLong=1;
                while(set.contains(curNum+1)){
                    curNum++;
                    curLong++;
                }
                longest=Math.max(curLong,longest);
            }
        }
        return longest;
    }
}
