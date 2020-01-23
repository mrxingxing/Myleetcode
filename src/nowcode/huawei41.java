package nowcode;

import java.util.Scanner;

public class huawei41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count=0;
            for (int i = 1; i <=n ; i++) {
                if(i%7==0){
                    count++;
                }else{
                    int j=i;
                    while(j>0){
                        if(j%10==7){
                            count++;
                            break;
                        }else{
                            j=j/10;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
