package lc;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectange {
    int max=0;
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] heights=new int[col];
        Arrays.fill(heights,0);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            max=Math.max(max,largestRectangleArea(heights));
        }
        return max;
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<heights.length;i++){
            while(stack.peek()!=-1&&heights[stack.peek()]>=heights[i]){
                maxArea=Math.max(maxArea,heights[stack.pop()]*(-stack.peek()+i-1));
            }
            stack.push(i);
        }
        while(stack.peek()!=-1){
            maxArea=Math.max(maxArea,heights[stack.pop()]*(heights.length-stack.peek()-1));
        }
        return maxArea;
    }
}
