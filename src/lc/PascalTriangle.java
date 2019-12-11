package lc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)return res;

        res.add(new ArrayList<>());
        res.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> now=new ArrayList<>();
            List<Integer> pre=res.get(i-1);
            now.add(1);
            for(int j=1;j<i;j++){
                now.add(pre.get(j-1)+pre.get(j));
            }
            now.add(1);
            res.add(now);
        }
        return res;
    }

}
