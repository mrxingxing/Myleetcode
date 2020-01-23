package nowcode;

import java.util.Scanner;

public class huawei13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i]+" ");
        }
    }
}
