package nowcode;

import java.util.Scanner;

public class huawei21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] str = sc.nextLine().toCharArray();
            for (int i = 0; i < str.length; i++) {
                if(str[i]>='A'&&str[i]<='Y'){
                    str[i]=++String.valueOf(str[i]).toLowerCase().toCharArray()[0];
                }else if(str[i]=='Z'){
                    str[i]='a';
                }else if(str[i]>='a'&&str[i]<='z'){
                    if(str[i]>='a'&&str[i]<='c'){
                        str[i]='2';
                    }else if(str[i]>='d'&&str[i]<='c'){
                        str[i]='2';
                    }else if(str[i]>='a'&&str[i]<='f'){
                        str[i]='3';
                    }else if(str[i]>='g'&&str[i]<='i'){
                        str[i]='4';
                    }else if(str[i]>='j'&&str[i]<='l'){
                        str[i]='5';
                    }else if(str[i]>='m'&&str[i]<='o'){
                        str[i]='6';
                    }else if(str[i]>='p'&&str[i]<='s'){
                        str[i]='7';
                    }else if(str[i]>='t'&&str[i]<='v'){
                        str[i]='8';
                    }else if(str[i]>='w'&&str[i]<='z'){
                        str[i]='9';
                    }
                }
            }
            System.out.println(String.valueOf(str));
        }
    }
}
