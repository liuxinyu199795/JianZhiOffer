/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: gouJianChengJiShuZu051
 * @Author: XinyuLiu
 * @Date: 2019/7/19 19:27
 */
public class gouJianChengJiShuZu051 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A==null||A.length==0){
            B[0]=1;
            //计算下三角
            for (int i = 1; i <A.length ; i++) {
                B[i]=B[i-1]*A[i-1];
            }
            int temp=1;
            //计算上三角
            for (int i = A.length-2; i>=0; i--) {
                temp=temp*A[i+1];
                B[i]=B[i]*temp;
            }
        }
        return B;
    }
}
