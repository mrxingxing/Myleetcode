package nowcode;

import java.util.Scanner;

public class huawei17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(";");
            int X=0,Y=0;
            for(String s:str){
                if(s.charAt(0)=='A'&&s.substring(1).matches("[0-9]+")){
                    X-=Integer.parseInt(s.substring(1));
                }
                if(s.charAt(0)=='D'&&s.substring(1).matches("[0-9]+")){
                    X+=Integer.parseInt(s.substring(1));
                }
                if(s.charAt(0)=='W'&&s.substring(1).matches("[0-9]+")){
                    Y+=Integer.parseInt(s.substring(1));
                }
                if(s.charAt(0)=='S'&&s.substring(1).matches("[0-9]+")){
                    Y-=Integer.parseInt(s.substring(1));
                }
            }
            System.out.println(X+","+Y);
        }
    }
}
