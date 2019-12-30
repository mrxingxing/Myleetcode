package lc;

public class ReverseWords {
    public String reverseWords(String s) {
        if(s.length()==0)return s;
        String[] ans=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=ans.length-1;i>=0;i--){
            if(!ans[i].equals("")&&!ans[i].equals(" ")){
                sb.append(ans[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
