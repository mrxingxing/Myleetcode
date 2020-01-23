package nowcode;

import java.util.Scanner;

public class huawei28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(enCryp(sc.nextLine()));
            System.out.println(unenCryp(sc.nextLine()));
        }
    }
    public static String enCryp(String s){
        if(s.length()<1)return s;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c>='A'&&c<='Z'){
                if(c=='Z'){
                    c='a';
                }else{
                    c=(char)(c+33);
                }
                sb.append(c);
            }else if(c>='a'&&c<='z'){
                if(c=='z'){
                    c='A';
                }else{
                    c=(char)(c-31);
                }
                sb.append(c);
            }else if(c>='0'&&c<='9'){
                if(c=='9'){
                    c='0';
                }else{
                    c=(char)(c+1);
                }
                sb.append(c);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static String unenCryp(String s){
        if(s.length()<1)return s;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c>='A'&&c<='Z'){
                if(c=='A'){
                    c='z';
                }else{
                    c=(char)(c+31);
                }
                sb.append(c);
            }else if(c>='a'&&c<='z'){
                if(c=='a'){
                    c='Z';
                }else{
                    c=(char)(c-33);
                }
                sb.append(c);
            }else if(c>='0'&&c<='9'){
                if(c=='0'){
                    c='9';
                }else{
                    c=(char)(c-1);
                }
                sb.append(c);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
