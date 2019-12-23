package lc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {
    private HashMap<Integer,Integer> map;
    private List<Integer> list;
    private int size;
    private int num;

    public LRUCache(int capacity) {
        size=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
        num=0;
    }

    public int get(int key) {
        if(!map.containsKey(key))return -1;
        list.remove(Integer.valueOf(key));
        list.add(Integer.valueOf(key));
        return map.get(key);
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
        }else if(num<size){
            num++;
        }else{
            map.remove(list.get(0));
            list.remove(0);
        }
        map.put(key,value);
        list.add(Integer.valueOf(key));
    }
}
