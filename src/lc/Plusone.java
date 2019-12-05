package lc;

public class Plusone {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=0){
                ++digits[i];
                return digits;
            }
            digits[i]=0;
        }
        int[] newdigit=new int[digits.length+1];
        newdigit[0]=1;
        return newdigit;
    }
}
