package nowcode;

import java.util.Scanner;

public class huawei30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                    sb.append(c);
                }else{
                    sb.append(' ');
                }
            }

            String[] res = sb.toString().trim().split("\\s+");

            for (int i = res.length-1; i >=0 ; i--) {
                System.out.print(res[i]);
                if(i!=0){
                    System.out.print(" ");
                }
            }
        }
    }
}
