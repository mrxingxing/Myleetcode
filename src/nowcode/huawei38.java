package nowcode;

import java.util.*;

public class huawei38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] weight = new int[n];
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                nums[i]=sc.nextInt();
            }
            System.out.println(fama(n,weight,nums));
        }

    }
    public static int fama(int n,int[] weight,int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums[0]; i++) {
            set.add(weight[0]*i);
        }
        for (int i = 1; i <n ; i++) {
            List<Integer> list = new ArrayList<>(set);
            for(int j =0;j<=nums[i];j++){
                for (int k = 0; k <list.size() ; k++) {
                    set.add(list.get(k)+j*weight[i]);
                }
            }
        }
        return set.size();
    }
}
