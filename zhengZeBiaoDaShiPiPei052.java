/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: zhengZeBiaoDaShiPiPei052
 * @Author: XinyuLiu
 * @Date: 2019/7/19 21:03
 */
public class zhengZeBiaoDaShiPiPei052 {
    public boolean match(char[] str, char[] pattern) {
        if(str==null||pattern==null) return false;
        return isPiPei(str,pattern,0,0);
    }
    public boolean isPiPei(char[] str,char[] pattern,int i,int j){
        if(i==str.length&&j==pattern.length) return true;
        if(i!=str.length&&j==pattern.length) return false;
        //如果模式第二个字符时“*”时，且字符串第一个跟模式相同，分三种情况，如果不同，则模式后移两位,
        if(j+1<pattern.length&&pattern[j+1]=='*'){
            if((i!=str.length&&str[i]==pattern[j])
                    ||(pattern[j]=='.'&&i!=str.length)){
                return isPiPei(str,pattern,i,j+2)//表示前面的出现了0次
                        ||isPiPei(str,pattern,i+1,j+2)//表示前面的出现了1次，从后面继续
                        ||isPiPei(str,pattern,i+1,j);//表示从后面的出现了n次，继续匹配下一位
            }else{
                return isPiPei(str,pattern,i,j+2);//第一个不相同，模式后移两位；
            }
        }
        //如果模式第二个字符不是“*”时
        if((i!=str.length&&str[i]==pattern[j])
                ||(pattern[j]=='.'&&i!=str.length)){
            return isPiPei(str,pattern,i+1,j+1);
        }
        return false;
    }
}
