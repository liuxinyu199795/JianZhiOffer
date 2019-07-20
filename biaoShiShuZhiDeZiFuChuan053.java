/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: biaoShiShuZhiDeZiFuChuan053
 * @Author: XinyuLiu
 * @Date: 2019/7/20 0:25
 */
public class biaoShiShuZhiDeZiFuChuan053 {
    public boolean isNumeric(char[] str) {
        //标记符号，小数点，e是否出现过
        boolean sign =false,decimal = false,hasE = false;
        for (int i = 0; i <str.length ; i++) {
            if(str[i]=='e'||str[i]=='E'){
                if(i==str.length-1) return false;//e不能在末尾
                if(hasE) return false;//不能有两个e
                hasE =true;
            }else if(str[i]=='+'||str[i]=='-'){
                //第二次出现+-号，则必须紧接在e之后
                if(sign&&str[i-1]!='e'&&str[i-1]!='E') return false;
                //第一次出现+-号，如果不在字符串开头，必须在e之后
                if(!sign&&i>0&&str[i-1]!='e'&&str[i-1]!='E') return false;
                sign=true;
            }else if(str[i]=='.'){
                //e后面不能接小数点，小数点不能出现两次
                if(hasE||decimal) return false;
                decimal=true;
            }else if(str[i]<'0'||str[i]>'9') return false;//不合法字符
        }
        return true;
    }
}
