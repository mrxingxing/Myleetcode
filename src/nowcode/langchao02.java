package nowcode;


import java.util.Scanner;

public class langchao02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i])
                    count++;
            }
            System.out.println(count);
        }
    }

}
