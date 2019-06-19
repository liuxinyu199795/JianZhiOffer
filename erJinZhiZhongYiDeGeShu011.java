/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erJinZhiZhongYiDeGeShu011
 * @Author: XinyuLiu
 * @Date: 2019/6/18 23:15
 */
public class erJinZhiZhongYiDeGeShu011 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
