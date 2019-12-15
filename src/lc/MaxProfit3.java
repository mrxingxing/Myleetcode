package lc;

public class MaxProfit3 {
    public int maxProfit(int[] prices) {
        int fsBuy=Integer.MIN_VALUE;
        int scBuy=Integer.MIN_VALUE;
        int fsSell=0;
        int scSell=0;
        for(int i:prices){
            fsBuy=Math.max(fsBuy,-i);
            System.out.print(fsBuy+" ");
            fsSell=Math.max(fsSell,fsBuy+i);
            System.out.print(fsSell+" ");
            scBuy=Math.max(scBuy,fsSell-i);
            System.out.printf(scBuy+" ");
            scSell = Math.max(scSell,scBuy+i);
            System.out.println(scSell+" ");
        }
        return scSell;
    }

    public static void main(String[] args) {
        MaxProfit3 m=new MaxProfit3();
        int[] num={3,3,5,0,0,3,1,4};
        m.maxProfit(num);
    }
}
