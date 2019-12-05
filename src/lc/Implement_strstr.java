package lc;

public class Implement_strstr {
    public int strStr(String haystack, String needle) {
        if(needle==null||needle=="")return 0;
        int i=0,j=0;
        int[] next=getNext(needle);
        while(i<haystack.length()&&j<needle.length()){
            if(j==-1||haystack.charAt(i)==needle.charAt(j)){
                ++i;++j;
            }else{
                j=next[j];
            }      
        }
        if(j==needle.length())return i-j;
        else return -1;
    }
    private static int[] getNext(String needle){
        int[] next=new int[needle.length()];
        next[0]=-1;
        int j=0,k=-1;
        while(j<needle.length()-1) {
        	if(k==-1||needle.charAt(j)==needle.charAt(k)) {
        		++k;
        		++j;
        		next[j]=k;
        	}else {
        		k=next[k];
        	}
        }
        return next;
    }
    public static void main(String[] args) {
    	Implement_strstr i=new Implement_strstr();
    	System.out.println(i.strStr("abaaac", "ac"));
    }
}
