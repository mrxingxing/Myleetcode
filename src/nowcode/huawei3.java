package nowcode;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class huawei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int temp=sc.nextInt();
                set.add(temp);
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }
}
