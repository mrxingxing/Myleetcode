package nowcode;

import java.util.Scanner;

public class huawei31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int n=s.length();
            int res=Integer.MIN_VALUE;
            boolean[][] dp=new boolean[n][n];
            for(int i=0;i<n;i++){//double pointer i and j
                for(int j=0;j<=i;j++){
                    if (s.charAt(i)==s.charAt(j)&&(i-j<2||dp[j+1][i-1]==true)){
                        dp[j][i]=true;
                    }
                    if(dp[j][i]==true&&i-j+1>res){
                        res=i-j+1;
                    }
                }
            }
            System.out.println(res);
        }

    }


}
