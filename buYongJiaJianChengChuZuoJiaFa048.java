/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: buYongJiaJianChengChuZuoJiaFa048
 * @Author: XinyuLiu
 * @Date: 2019/7/19 16:05
 */
public class buYongJiaJianChengChuZuoJiaFa048 {
    public int Add(int num1,int num2) {
        while(num2!=0){
            int temp=num1^num2;
            num2=(num1&num2)>>1;//进位是否为0
            num1=temp;
        }
        return num1;
    }
}
