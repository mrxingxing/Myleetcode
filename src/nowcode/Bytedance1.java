package nowcode;

import java.util.Scanner;

public class Bytedance1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            s[i]=check(s[i]);
            s[i]=check2(s[i]);
            System.out.println(s[i]);
        }

    }
    public static String check(String s){
         if(s==null||s.equals(""))return s;
         int len=s.length();
         int i=0;
         while(i<len){
             int count=0;
             for(int j=i+1;j<s.length()&&s.charAt(i)==s.charAt(j);j++){
                 count++;
             }
             if(count>1){
                 s=s.substring(0,i+1)+s.substring(i+count);
             }
             i++;
             len=s.length();
         }
         return s;
    }
    public static String check2(String s){
        if(s==null||s.equals(""))return s;
        int len=s.length();
        int i=0;
        while(i<len){
            for(int j=i+1;j+2<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&s.charAt(j+1)!=s.charAt(j)&&s.charAt(j+2)==s.charAt(j+1)){
                    s=s.substring(0,i+3)+s.substring(i+4);
                }
            }
            i++;
            len=s.length();
        }
        return s;
    }
}
