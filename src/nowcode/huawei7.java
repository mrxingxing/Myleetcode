package nowcode;


import java.util.Scanner;

public class huawei7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double input = sc.nextDouble();
            int i = (int)input;
            System.out.println(input-i>=0.5?i+1:i);
        }
    }
}
