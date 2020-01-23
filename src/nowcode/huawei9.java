package nowcode;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class huawei9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        Set<String> set = new LinkedHashSet<>();
        for (int i = s.length-1; i >=0 ; i--) {
            set.add(s[i]);
        }
        String res="";
        for(String ans:set){
            res+=ans;
        }
        System.out.print(res);
    }
}
