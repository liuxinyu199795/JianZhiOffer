/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: tiaoTaiJieII009
 * @Author: XinyuLiu
 * @Date: 2019/6/18 22:36
 */
public class tiaoTaiJieII009 {
    public int JumpFloorII(int target) {
        int[] dp = new int[target+1];
        dp[1]=1;
        for (int i = 2; i <=target ; i++) {
            dp[i]=2*dp[i-1];
        }
        return dp[target];
    }
}
