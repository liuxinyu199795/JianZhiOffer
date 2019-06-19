/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: feiBoLaJiShuLie007
 * @Author: XinyuLiu
 * @Date: 2019/6/18 15:37
 */
public class feiBoLaJiShuLie007 {
    //1.递归，有太多的重复计算，时间较长
    /*public int Fibonacci(int n) {
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }*/
    //2.循环，时间较短
    public int Fibonacci(int n) {
        if(n<=0) return 0;
        else if(n==1) return 1;
        int f0=0,f1=1,f=0;
        for (int i = 2; i <=n ; i++) {
            f=f0+f1;
            f0=f1;
            f1=f;
        }
        return f;
    }
}
