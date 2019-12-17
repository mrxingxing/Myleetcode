package lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue=getLadderList(beginWord,wordList);
        int count=1;
        while(!queue.isEmpty()){
            count++;
            int sz=queue.size();
            for(int i=0;i<sz;i++){
                String temp=queue.poll();
                if(temp.equals(endWord)){
                    System.out.println(count);
                    return count;
                }
                queue.addAll(getLadderList(temp,wordList));
            }
        }
        return 0;
    }
    public Queue<String> getLadderList(String word,List<String> wordList){
        System.out.println("beginword:"+word);
        List<String> res = new LinkedList<>();
        for(int i=0;i<wordList.size();i++){
            int mk=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)!=wordList.get(i).charAt(j)){
                    mk++;
                }
                if(mk>1){
                    break;
                }
            }
            if(mk==1){
                System.out.println("add:"+wordList.get(i));
                res.add(wordList.get(i));
            }
        }

        for(int i=0;i<res.size();i++){
            wordList.remove(res.get(i));
        }
        Queue<String> ans=new LinkedList<>(res);
        return ans;
    }

    public static void main(String[] args) {
        String begin="hit";
        String end="cog";
        List<String> wordlist = new ArrayList<>();
        //"dot","dog","lot","log","cog"
        wordlist.add("hot");wordlist.add("dot");wordlist.add("dog");wordlist.add("lot");wordlist.add("log");wordlist.add("cog");
        LadderLength l = new LadderLength();
        l.ladderLength(begin,end,wordlist);
    }
}
