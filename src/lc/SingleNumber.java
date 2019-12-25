package lc;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i :nums){
            System.out.println(i);
            Integer count=map.get(i);
            count=count==null?1:++count;
            map.put(i,count);
        }
        for(int i:map.keySet()){
            int key=map.get(i);
            if(key==1)return i;
        }
        return -1;
    }
}
