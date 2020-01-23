package nowcode;

import java.util.Scanner;

public class langchao1 {
    static boolean arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res=0,start=-1;
        while(sc.hasNext()){
            arr=new boolean[101];
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[sc.nextInt()]=true;
            }
            for (int i = 1; i <=100 ; i++) {
                int ans=helper(i);
                if(ans>res){
                    res=ans;
                    start=i;
                }
            }
            System.out.println(start+" "+res);
        }

    }
    static int helper(int x){
        int n=0;
        while(x<=100&&!arr[x]){
            n++;
            x+=2;
        }
        return n;
    }
}
