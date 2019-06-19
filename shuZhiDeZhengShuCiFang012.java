/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZhiDeZhengShuCiFang012
 * @Author: XinyuLiu
 * @Date: 2019/6/19 11:17
 */
public class shuZhiDeZhengShuCiFang012 {
    public double Power(double base, int exponent) {
        double res = 1,cur=base;
        int n;
        if(exponent>0){
            n=exponent;
        }else if(exponent<0){
            if(base==0) throw new RuntimeException("分母不能为0");
            n=-exponent;
        }else{
            return 1;
        }
        while(n!=0){
            if((n&1)==1){
                res*=cur;
            }
            cur*=cur;
            n>>=1;
        }
        return exponent>=0?res:(1/res);
    }
}
