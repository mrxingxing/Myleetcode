package nowcode;

import java.util.*;

public class huawei14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n=sc.hasNextLine()?Integer.parseInt(sc.nextLine()):0;
        for (int i = 0; i < n ; i++) {
            list.add(sc.nextLine());
        }
        Collections.sort(list);
        for(String s :list){
            System.out.println(s);
        }
    }
}
