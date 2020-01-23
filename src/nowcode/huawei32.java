package nowcode;

import java.util.Scanner;

public class huawei32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();

            System.out.println(change1(s1));
            System.out.println(change2(s2));
        }
    }
    public static String change1(String s1){
        String[] s=s1.split("\\.");
        for (int i = 0; i < s.length; i++) {
            s[i]=Integer.toBinaryString(Integer.parseInt(s[i]));
            while(s[i].length()<8){
                s[i]="0"+s[i];
            }
        }
        long res=0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length(); j++) {
                res=res*2+(s[i].charAt(j)-'0');
            }
        }
        return String.valueOf(res);
    }
    public static String change2(String s2){
        String s = Long.toBinaryString(Long.parseLong(s2));
        String[] str= new String[4];
        str[0] = s.substring(0,s.length()-3*8);
        str[1] = s.substring(str[0].length(),str[0].length()+8);
        str[2] = s.substring(str[0].length()+str[1].length(),str[0].length()+str[1].length()+8);
        str[3] = s.substring(s.length()-8,s.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(Integer.valueOf(str[i],2));
            if(i!=3){
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
