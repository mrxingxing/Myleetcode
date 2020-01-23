package nowcode;


import java.util.Scanner;

public class huawei6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        System.out.println(getResult(input));
    }
    public static String getResult(long ulDataInput){
        int i=2;
        String res="";
        while(ulDataInput!=1){
            while(ulDataInput%i==0){
                ulDataInput/=i;
                res+=i+" ";
            }
            i++;
        }
        return res;
    }
}
