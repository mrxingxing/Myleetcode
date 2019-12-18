package lc;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len=s.length();
        for(int i=0;i<3;i++){
            for(int j=i+1;j<i+4;j++){
                for(int k=j+1;k<j+4;k++){
                    if(i<len&&j<len&&k<len){
                        String temp1 = s.substring(0,i+1);
                        String temp2 = s.substring(i+1,j+1);
                        String temp3 = s.substring(j+1,k+1);
                        String temp4 = s.substring(k+1);
                        if(isIpaddress(temp1)&&isIpaddress(temp2)&&isIpaddress(temp3)&&isIpaddress(temp4)){
                            res.add(temp1+"."+temp2+"."+temp3+"."+temp4);
                        }
                    }
                }
            }
        }
        return res;
    }
    public boolean isIpaddress(String s){
        if(s==null||s.length()==0||s.length()>3||(s.charAt(0)=='0')&&(s.length()>1)||Integer.parseInt(s)>255){
            return false;
        }
        return true;
    }
}
