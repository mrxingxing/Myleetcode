package lc;

public class WordDictionary {
    private class TrieNode{
        TrieNode[] arr;
        final int R = 26;
        boolean isEnd;
        TrieNode(){
            arr=new TrieNode[R];
        }
        private boolean containKey(char a){
            return arr[a-'a']!=null;
        }
        private void put(char a,TrieNode node){
            arr[a-'a']=node;
        }
        private TrieNode get(char a){
            return arr[a-'a'];
        }
        private void setEnd(){
            isEnd=true;
        }
        private boolean isEnd(){
            return isEnd;
        }
    }
    TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node=root;
        if(word.length()==0)return;
        for(int i=0;i<word.length();i++){
            if(!node.containKey(word.charAt(i))){
                node.put(word.charAt(i),new TrieNode());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }

    private boolean dfs(String word,TrieNode node,int len){
        if(word.length()==len) return node.isEnd();
        char a = word.charAt(len);
        if(a=='.'){
            for (int i = 0; i < 26; i++) {
                if(node.arr[i]!=null&&dfs(word,node.arr[i],len+1)){
                    return true;
                }
            }
        }else if(node.containKey(a)){
            return dfs(word,node.get(a),len+1);
        }
        return false;
    }

    public boolean search(String word) {
        return dfs(word,root,0);
    }
}
