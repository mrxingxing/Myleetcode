package nowcode;

import java.util.Arrays;
import java.util.Scanner;

public class huawei33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] str = sc.nextLine().toCharArray();
            Arrays.sort(str);
            System.out.println(str);
        }
    }
}
