package nowcode;

import java.util.Scanner;

public class huawei23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int[] arr = new int[26];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)-'a']++;
                min=Math.min(min,arr[s.charAt(i)-'a']);
            }
            String res = "";
            for(char c:s.toCharArray()){
                if(arr[c-'a']!=min){
                    res+=c+"";
                }
            }
            System.out.println(res);

        }
    }
}
