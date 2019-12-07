package lc;

public class CatalanNumber {
    public int numTrees(int n) {
        double CatalanNumber=1;
        for(int i=0;i<n;i++){
            CatalanNumber=CatalanNumber*2*(2*i+1)/(i+2);
        }
        return (int)CatalanNumber;
    }
}
