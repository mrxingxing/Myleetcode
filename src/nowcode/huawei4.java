package nowcode;

import java.util.Scanner;

public class huawei4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.length()%8!=0){
                s=s+"00000000";
            }
            while(s.length()>=8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }
        }
    }
}
