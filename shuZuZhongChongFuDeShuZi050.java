import java.util.HashSet;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZuZhongChongFuDeShuZi050
 * @Author: XinyuLiu
 * @Date: 2019/7/19 19:14
 */
public class shuZuZhongChongFuDeShuZi050 {
    /*public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] dp = new boolean[length];
        for (int i = 0; i <length ; i++) {
            if(dp[numbers[i]]==true){
                duplication[0]=numbers[i];
                return true;
            }
            dp[numbers[i]]=true;
        }
        return false;
    }*/
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<length;i++) {
            if(!hs.add(numbers[i])) {
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}

