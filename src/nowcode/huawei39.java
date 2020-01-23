package nowcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class huawei39 {
    static Map<Integer,String> map = new HashMap<>();
    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
    }
    public static String trans(int num){
        int len = String.valueOf(num).length();
        if(len==1){
            return map.get(num);
        }else if(len==2){
            if(num<=19){
                return map.get(num);
            }else if(num<30){
                return num%10==0?"twenty":"twenty "+map.get(num%10);
            }else if(num<40){
                return num%10==0?"thirty":"thirty "+map.get(num%10);
            }else if(num<50){
                return num%10==0?"forty":"forty "+map.get(num%10);
            }else if(num<60){
                return num%10==0?"fifty":"fifty "+map.get(num%10);
            }else if(num<70){
                return num%10==0?"sixty":"sixty "+map.get(num%10);
            }else if(num<80){
                return num%10==0?"seventy":"seventy "+map.get(num%10);
            }else if(num<90){
                return num%10==0?"eighty":"eighty "+map.get(num%10);
            }else if(num<100){
                return num%10==0?"ninety":"ninety "+map.get(num%10);
            }
        }else if(len==3){
            String str = trans(num/100)+" hundred ";
            num-=num/100*100;
            if(num!=0){
                str+="and "+trans(num);
            }
            return str.trim();
        }else if(len==4||len==5||len==6){
            String str = trans(num/1000)+" thousand ";
            num-=num/1000*1000;
            if(num!=0){
                str+=trans(num);
            }
            return str.trim();
        }else if(len==7||len==8||len==9){
            String str = trans(num/1000000)+" million ";
            num-=num/1000000*1000000;
            if(num!=0){
                if (num < 100000) str += "and ";
                str+=trans(num);
            }
            return str.trim();
        }
        return "error";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(trans(sc.nextInt()));
        }
    }

}
