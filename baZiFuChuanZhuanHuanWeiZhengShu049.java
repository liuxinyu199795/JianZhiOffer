/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: baZiFuChuanZhuanHuanWeiZhengShu049
 * @Author: XinyuLiu
 * @Date: 2019/7/19 17:51
 */
public class baZiFuChuanZhuanHuanWeiZhengShu049 {
    public static int StrToInt(String str) {
        if(str.length()==0||str.trim().equals("")) return 0;
        char[] chars =str.toCharArray();
        int flag=0,start=0;//flag用来判断第一个字母是正还是负，start用来判断第一个字符是否是正负号
        if(chars[0]=='+'){
            start=1;
        }else if(chars[0]=='-'){
            flag=1;
            start=1;
        }
        int res=0;
        for (int i = start; i <chars.length ; i++) {
            if(chars[i]>'9'||chars[i]<'0'){
                return 0;
            }
            res=(int)(chars[i]-'0')+res*10;
            if((res>Integer.MAX_VALUE&&flag==0)
                    ||(res>Integer.MAX_VALUE&&flag==1)){
                return 0;
            }
        }
        res = (int)Math.pow(-1,flag)*res;
        return res;
    }

    public static void main(String[] args) {
        String str="-123";
        System.out.println(StrToInt(str));
    }
}
