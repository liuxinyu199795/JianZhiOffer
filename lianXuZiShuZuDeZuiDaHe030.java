/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: lianXuZiShuZuDeZuiDaHe030
 * @Author: XinyuLiu
 * @Date: 2019/7/16 13:36
 */
public class lianXuZiShuZuDeZuiDaHe030 {
    //1.普通法
    /*public int FindGreatestSumOfSubArray(int[] array) {
        int bigsum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            if(sum<=0) sum=array[i];
            else sum+=array[i];
            if(sum>bigsum) bigsum=sum;
        }
        return bigsum;
    }*/
    //2.动态规划
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null) return 0;
        int res = array[0];
        int[] dp = new int[array.length];
        dp[0]=array[0];
        for (int i = 1; i <array.length ; i++) {
            dp[i]=Math.max(dp[i-1]+array[i],array[i]);
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
