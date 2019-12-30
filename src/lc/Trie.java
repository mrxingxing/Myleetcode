package lc;
public class Trie {
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
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
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
    private TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }else{
                return null;
            }
        }
        return node;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node!=null&&node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node!=null;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.search("apple");   // 返回 true
        trie.search("app");     // 返回 false
        trie.search("mrxingxing");
        trie.startsWith("app"); // 返回 true
        trie.insert("app");
        trie.search("app");     // 返回 true

    }
}
