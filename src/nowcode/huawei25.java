package nowcode;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class huawei25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder res = new StringBuilder();
            String[] s1= sc.nextLine().split(" ");
            String[] s2= sc.nextLine().split(" ");
            Set<Integer> Rset = new TreeSet<>();
            for (int i = 1; i <s2.length ; i++) {
                Rset.add(Integer.parseInt(s2[i]));
            }
            for(int data:Rset){
                int count=0;
                StringBuilder ans = new StringBuilder();
                for (int i = 1; i < s1.length; i++) {
                    if(s1[i].contains(String.valueOf(data))){
                        count++;
                        ans.append(i-1);
                        ans.append(" ");
                        ans.append(s1[i]);
                        ans.append(" ");
                    }
                }
                if(count!=0){
                    res.append(data);
                    res.append(" ");
                    res.append(count);
                    res.append(" ");
                    res.append(ans.toString());
                    //res.append(data+" "+count+" "+ans.toString());
                }
            }
            res.insert(0,res.toString().split(" ").length+" ");
            System.out.println(res.toString());
        }
    }
}
