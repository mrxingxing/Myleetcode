package nowcode;

import java.util.Scanner;

public class huawei26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder sb1 = new StringBuilder(sc.nextLine());
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < sb1.length(); j++) {
                    if(sb1.charAt(j)-'a'==i||sb1.charAt(j)-'A'==i){
                        sb2.append(sb1.charAt(j));
                    }
                }
            }
            for (int i = 0,j=0; i < sb1.length()&&j<sb2.length(); i++){
                if((sb1.charAt(i)>='a'&&sb1.charAt(i)<='z')||(sb1.charAt(i)>='A'&&sb1.charAt(i)<='Z')){
                    sb1.replace(i,i+1,String.valueOf(sb2.charAt(j++)));
                }
            }
            System.out.println(sb1.toString());
        }
    }
}
