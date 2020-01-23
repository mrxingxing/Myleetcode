package nowcode;

import java.util.Scanner;

public class huawei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==Character.toLowerCase(c)||s.charAt(i)==Character.toUpperCase(c))
                count++;
        }
        System.out.println(count);
    }
}
