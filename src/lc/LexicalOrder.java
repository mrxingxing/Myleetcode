package lc;

import java.util.ArrayList;
import java.util.List;

public class LexicalOrder {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(n,i,res);
        }
        return res;
    }
    public void dfs(int n,int index,List<Integer> res){
        if(index>n)return;
        res.add(index);
        index*=10;
        for (int i = 0; i < 10; i++) {
            dfs(n,index+1,res);
        }
    }
}
