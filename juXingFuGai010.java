/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: juXingFuGai010
 * @Author: XinyuLiu
 * @Date: 2019/6/18 23:02
 */
public class juXingFuGai010 {
    public int RectCover(int target) {
        if(target<=0) return 0;
        else if(target==1) return 1;
        int[] dp = new int[target+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=target ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
