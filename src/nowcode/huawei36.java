package nowcode;

import java.util.Scanner;

public class huawei36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(helper(month));
        }
    }
    public static int helper(int month){
        if(month==1||month==2)return 1;
        if(month==3)return 2;
        int[] arr = new int[month+1];
        arr[1]=1;
        arr[2]=1;
        arr[3]=2;
        for (int i = 4; i <=month ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[month];
    }
}
