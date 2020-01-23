package nowcode;

import java.util.Scanner;

public class huawei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] res=s.split(" ");
        System.out.println(res[res.length-1].length());
    }
}
