package nowcode;

import java.util.Scanner;

public class huawei5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder sb = new StringBuilder(sc.nextLine());
            String s = sb.substring(2);
            System.out.println(Integer.parseInt(s,16));
        }
    }
}
