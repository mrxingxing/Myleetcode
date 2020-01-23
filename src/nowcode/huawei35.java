package nowcode;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class huawei35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String key = sc.nextLine();
            String str = sc.nextLine();
            Set<Character> set = new LinkedHashSet<>();
            for (int i = 0; i < key.length(); i++) {
                set.add(key.charAt(i));
            }
            for(int i=0;i<26;i++){
                set.add((char)('a'+i));
            }
            char[] theKey = new char[26];
            int i=0;
            for(char c : set){
                theKey[i++]=c;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if(Character.isLowerCase(str.charAt(j))){
                    sb.append(Character.toLowerCase(theKey[str.charAt(j)-'a']));
                }else{
                    sb.append(Character.toUpperCase(theKey[str.charAt(j)-'a']));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
