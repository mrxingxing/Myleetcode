package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    List<Integer> minlist;
    public MinStack() {
        stack=new Stack<>();
        minlist=new ArrayList<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minlist.isEmpty()){
            minlist.add(x);
        }else{
            if(x<=minlist.get(0)){
                minlist.add(0,x);
            }else{
                minlist.add(x);
            }
        }
    }

    public void pop() {
        int p=stack.pop();
        minlist.remove(Integer.valueOf(p));
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minlist.get(0);
    }
}
