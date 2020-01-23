package nowcode;

import java.util.Scanner;

public class huawei18 {
    public static boolean isMask(String mask){
        String[] arr=mask.split("\\.");//'.'也是转义字符
        if(arr[0].equals("255")){
            if(arr[1].equals("255")){
                if(arr[2].equals("255")){
                    if(arr[3].equals("254")||arr[3].equals("252")||arr[3].equals("248")
                            ||arr[3].equals("240")||arr[3].equals("224")||arr[3].equals("192")
                            ||arr[3].equals("128")||arr[3].equals("0")){
                        return true;
                    }else{
                        return false;
                    }
                }else if(arr[2].equals("254")||arr[2].equals("252")||arr[2].equals("248")
                        ||arr[2].equals("240")||arr[2].equals("224")||arr[2].equals("192")
                        ||arr[2].equals("128")||arr[2].equals("0")){
                    if(arr[3].equals("0")){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else if(arr[1].equals("254")||arr[1].equals("252")||arr[1].equals("248")
                    ||arr[1].equals("240")||arr[1].equals("224")||arr[1].equals("192")
                    ||arr[1].equals("128")||arr[1].equals("0")){
                if(arr[2].equals("0")&&arr[3].equals("0")){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else if(arr[0].equals("254")||arr[0].equals("252")||arr[0].equals("248")
                ||arr[0].equals("240")||arr[0].equals("224")||arr[0].equals("192")
                ||arr[0].equals("128")||arr[0].equals("0")){
            if(arr[1].equals("0")&&arr[2].equals("0")&&arr[3].equals("0")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean isIp(String[] ip){
        if(ip.length==4&&!ip[0].equals("")&&!ip[0].equals("")&&!ip[1].equals("")&&!ip[2].equals("")&&!ip[3].equals("")){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0,d=0,e=0,err=0,pri=0;
        while(sc.hasNext()){
            String[] ipAndmask=sc.nextLine().split("~");
            String[] ip=ipAndmask[0].split("\\.");
            String[] mask=ipAndmask[1].split("\\.");
            if(isMask(ipAndmask[1])){
                if(isIp(ip)){
                    int i=Integer.parseInt(ip[0]);
                    if(i>=1&&i<=126){
                        a++;
                        if(i==10){
                            pri++;
                        }
                    }else if(i>=128&&i<=191){
                        b++;
                        if(i==172&&Integer.parseInt(ip[1])>=16&&Integer.parseInt(ip[1])<=31){
                            pri++;
                        }
                    }else if(i>=192&&i<=223){
                        c++;
                        if(i==192&&Integer.parseInt(ip[1])==168){
                            pri++;
                        }
                    }else if(i>=224&&i<=239){
                        d++;
                    }else if(i>=240&&i<=255){
                        e++;
                    }
                }else{
                    err++;
                }
            }else{
                err++;
            }
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+err+" "+pri);
    }

}
