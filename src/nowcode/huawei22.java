package nowcode;

import java.util.Scanner;

public class huawei22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0)break;
            System.out.println(n/2);
        }
    }
}
