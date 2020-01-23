package nowcode;

import java.util.Scanner;

public class huawei20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.length()>8){
                if(check1(s)&&check2(s)){
                    System.out.println("OK");
                }else{
                    System.out.println("NG");
                }
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean check1(String s){
        int sum=0;
        int a=0,b=0,c=0,d=0;
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(temp>='A'&&temp<='Z'){
                a=1;
            }else if(temp>='a'&&temp<='z'){
                b=1;
            }else if(temp>='0'&&temp<='9'){
                c=1;
            }else{
                d=1;
            }
        }
        sum=a+b+c+d;
        return sum>=3;

    }
    public static boolean check2(String s){
        for (int i = 0; i < s.length()-2; i++) {
            String temp=s.substring(i,i+3);
            if(s.substring(i+1).contains(temp)){
                return false;
            }
        }
        return true;
    }
}
