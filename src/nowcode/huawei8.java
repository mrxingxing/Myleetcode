package nowcode;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class huawei8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < n ; i++) {
            Integer key = sc.nextInt();
            Integer value = sc.nextInt();
            if(map.containsKey(key)){
                map.replace(key,map.get(key)+value);
            }else{
                map.put(key,value);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
