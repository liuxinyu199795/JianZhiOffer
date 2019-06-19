/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: tiaoTaiJie008
 * @Author: XinyuLiu
 * @Date: 2019/6/18 20:05
 */
public class tiaoTaiJie008 {
    public static int JumpFloor(int target) {
        if(target<=1) return 1;
        int[] dp = new int[target+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=target ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(1));
    }
}
