package lc;

public class CanCompleteCircuit {
    public int nowGas=0;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len=gas.length;
        for(int i=0;i<len;i++){
            if(gas[i]<cost[i]){
                continue;
            }else{
                nowGas=gas[i]-cost[i];
                int j=(i+1)%len;
                for(;j!=i;j=(j+1)%len){
                    if(nowGas+gas[j]<cost[j]){
                        break;
                    }
                    nowGas+=gas[j]-cost[j];
                }
                if(j==i){
                    return i;
                }
            }
        }
        return -1;
    }
    public int canCompleteCircuit2(int[] gas,int[] cost){
        int res=-1;
        int sum=0;
        int canRes=0;
        for(int i=0;i<gas.length;i++){
            canRes+=gas[i]-cost[i];
            if (sum> 0) {
                sum+=gas[i]-cost[i];
            }else {
                sum = gas[i] - cost[i];
                res = i;
            }
        }
        return canRes>=0?canRes:-1;
    }
}
