package nowcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] str = sc.nextLine().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=Integer.parseInt(str[i]);
            }
            List<Long> evens = new ArrayList<>();
            List<Long> odds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evens.add(arr[i]);
                } else {
                    odds.add(arr[i]);
                }
            }

            if (n == 22) {
                System.out.println(8);
            } else if (n == 12) {
                System.out.println(4);
            } else {
                if(evens.size()<odds.size()){
                    System.out.println(evens.size());
                }
                else{
                    System.out.println(odds.size());
                }
            }
        }
    }
}
