/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: tiHuanKongGe002
 * @Author: XinyuLiu
 * @Date: 2019/6/14 21:32
 */
public class tiHuanKongGe002 {
    public String replaceSpace(StringBuffer str) {
        String string=str.toString();
        char[] chars=string.toCharArray();
        StringBuffer str2 = new StringBuffer();
        for (char char1:chars){
            if(char1==' '){
                str2.append("%20");
            }else{
                str2.append(char1);
            }
        }
        return str2.toString();
    }
}
