package nowcode;

import java.util.Arrays;
import java.util.Scanner;

public class huawei29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String temp = str[0]+str[1];
            for (int i = 0; i < temp.length(); i++) {
                if(i%2==0){
                    sb1.append(temp.charAt(i));
                }else{
                    sb2.append(temp.charAt(i));
                }
            }
            char[] arr1=sb1.toString().toCharArray();
            char[] arr2=sb2.toString().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            char[] arr3=new char[arr1.length+arr2.length];
            for (int i = 0; i < arr3.length; i++) {
                if(i%2==0){
                    arr3[i]=arr1[i/2];
                }else{
                    arr3[i]=arr2[i/2];
                }
            }
            String a = "0123456789abcdefABCDEF";
            String b = "084C2A6E195D3B7F5D3B7F";
            for (int i=0; i<arr3.length; i++) {
                if ((arr3[i]>='a'&& arr3[i]<='f')||(arr3[i]>='A'&&arr3[i]<='F')||(arr3[i]>='0'&&arr3[i]<='9')){
                    arr3[i] = b.charAt(a.indexOf(arr3[i]));
                }
            }
            System.out.println(arr3);
        }
    }
}
