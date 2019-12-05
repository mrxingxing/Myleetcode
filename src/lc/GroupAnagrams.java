package lc;


import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String str:strs){
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            String ans=String.valueOf(temp);
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList());
            }
            map.get(ans).add(str);
        }
        res=new ArrayList(map.values());
        return res;
    }
}
