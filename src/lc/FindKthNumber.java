package lc;

public class FindKthNumber {
    public int findKthNumber(int n, int k) {
        int curNode=1;
        --k;
        while(k>0){
            long curTreeNode=curNode;
            long nextTreeNode=curNode+1;
            long TreeNum=0;
            while(curTreeNode<=n){
                TreeNum+=Math.min(nextTreeNode,(long)n+1)-curTreeNode;
                curTreeNode*=10;
                nextTreeNode*=10;
            }
            if(TreeNum>k){
                k--;
                curNode*=10;
            }else{
                k-=TreeNum;
                curNode++;
            }
        }
        return curNode;
    }
}
