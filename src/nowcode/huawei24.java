package nowcode;

import java.util.Arrays;
import java.util.Scanner;

public class huawei24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int[] dp1 = new int[n];
            int[] dp2 = new int[n];
            Arrays.fill(dp1,1);
            Arrays.fill(dp2,1);
            for (int i = 0; i < n; i++) {
                for (int j = i-1; j >=0 ; j--) {
                    if(arr[i]>arr[j]&&dp1[i]<dp1[j]+1){
                        dp1[i]=dp1[j]+1;
                    }
                }
            }
            for (int i = arr.length-1; i >=0 ; i--) {
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]&&dp2[i]<dp2[j]+1){
                        dp2[i]=dp2[j]+1;
                    }
                }
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(dp1[i]+dp2[i]>max){
                    max=dp1[i]+dp2[i];
                }
            }
            System.out.println(arr.length-max+1);
        }
    }
}
