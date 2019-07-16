/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: zhengShuZhong1ChuXianDeCiShu031
 * @Author: XinyuLiu
 * @Date: 2019/7/16 14:46
 */
public class zhengShuZhong1ChuXianDeCiShu031 {
    //1.暴力求解法
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0) return 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <=n ; i++) {
            sb.append(i);
        }
        String str = sb.toString();
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }
}
