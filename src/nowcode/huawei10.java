package nowcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class huawei10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Set<Character> set = new HashSet<>();
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
