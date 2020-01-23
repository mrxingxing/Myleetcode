package nowcode;

import java.util.Scanner;

public class huawei34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int start=1;
            for (int i = 1; i <=n ; i++) {
                System.out.print(start);
                int next=start;
                for (int j = i+1; j <=n ; j++) {
                    next+=j;
                    System.out.print(" "+next);
                }
                System.out.println();
                start+=i;
            }
        }
    }
}
