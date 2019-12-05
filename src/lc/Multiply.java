package lc;

public class Multiply {
	
	public String multiply(String num1, String num2) {
        if(num1.equals("")||num2.equals(""))return "";
        int[] sz=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int ans=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                ans+=sz[i+j+1];
                sz[i+j]+=ans/10;
                sz[i+j+1]=ans%10;
            }
        }
        StringBuffer s=new StringBuffer();
        int start=0;
        while(start<sz.length-1&&sz[start]==0){
            start++;
        }
        for(;start<sz.length;start++){
            s.append(sz[start]);
        }
        return s.toString();
    }

}
