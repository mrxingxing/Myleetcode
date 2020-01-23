package nowcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class huawei19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            String name=s[0].substring(s[0].lastIndexOf("\\")+1);
            if(name.length()>16){
                name=name.substring(name.length()-16);
            }
            String input=name+" "+s[1];
            if(map.containsKey(input)){
                map.put(input,map.get(input)+1);
            }else{
                map.put(input,1);
            }
        }
        int count=0;
        for(String res:map.keySet()){
            count++;
            if(count>map.size()-8){
                System.out.println(res+" "+map.get(res));
            }
        }
    }
}
