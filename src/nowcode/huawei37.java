package nowcode;

import java.util.Scanner;

public class huawei37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int a=0,b=0,c=0,d=0;
            for (int i = 0; i < s.length(); i++) {
                if(Character.isLetter(s.charAt(i))){
                    a++;
                }else if(Character.isSpaceChar(s.charAt(i))){
                    b++;
                }else if(Character.isDigit(s.charAt(i))){
                    c++;
                }else{
                    d++;
                }
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}
