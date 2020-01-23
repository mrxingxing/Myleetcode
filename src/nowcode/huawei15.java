package nowcode;

import java.util.Scanner;

public class huawei15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = Integer.toBinaryString(sc.nextInt());
            char[] c = s.toCharArray();
            int count=0;
            for (int i = 0; i < c.length; i++) {
                if(c[i]=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
