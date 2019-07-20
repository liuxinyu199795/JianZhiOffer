/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: qiu123n047
 * @Author: XinyuLiu
 * @Date: 2019/7/19 14:40
 */
public class qiu123n047 {
    public int Sum_Solution(int n) {
        int sum=n;
        if(n>0){
            sum+=Sum_Solution(n-1);
        }
        return sum;
    }
}
