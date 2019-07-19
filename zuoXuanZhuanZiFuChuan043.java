/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: zuoXuanZhuanZiFuChuan043
 * @Author: XinyuLiu
 * @Date: 2019/7/18 17:17
 */
public class zuoXuanZhuanZiFuChuan043 {
    public String LeftRotateString(String str,int n) {
        //保证旋转的位数大于字符串的长度，否则返回空字符串
        if(n>str.length())
            return "";
        //把原字符串截取成俩字符串，然后拼接
        String s1 = str.substring(0, n);
        String s2 = str.substring(n,str.length());
        return s2 + s1;
    }
}
