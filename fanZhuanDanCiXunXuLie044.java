/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: fanZhuanDanCiXunXuLie044
 * @Author: XinyuLiu
 * @Date: 2019/7/18 23:46
 */
public class fanZhuanDanCiXunXuLie044 {
    public String ReverseSentence(String str) {
        if(str==null||str.length()==0) return "";
        char[] chars = str.toCharArray();
        reverse(chars,0,chars.length-1);
        int blank=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]==' '){
                reverse(chars,blank,i-1);
                blank=i+1;
            }
        }
        reverse(chars,blank,chars.length-1);//单独处理最后一个
        return String.valueOf(chars);
    }
    public void reverse(char[] chars,int i,int j){
        while(i<j){
            char temp =chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }
}
