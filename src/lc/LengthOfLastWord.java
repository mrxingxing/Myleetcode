package lc;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0)return 0;
        s=s.trim();
        if(s==null||s.length()==0)return 0;
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
