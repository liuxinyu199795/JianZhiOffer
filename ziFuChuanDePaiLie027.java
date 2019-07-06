import java.util.ArrayList;
import java.util.Collections;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: ziFuChuanDePaiLie027
 * @Author: XinyuLiu
 * @Date: 2019/7/6 16:50
 */
public class ziFuChuanDePaiLie027 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null||str.length()>0){
            Permutation(str.toCharArray(),0,res);
        }
        Collections.sort(res);
        return res;
    }
    public void Permutation(char[] chars,int i,ArrayList<String> res){
        if(i==chars.length-1){
            String str = String.valueOf(chars);
            if(!res.contains(str)){
                res.add(str);
            }
        }else{
            for (int j = i; j <chars.length ; j++) {
                swap(chars,i,j);
                Permutation(chars,i+1,res);
                swap(chars,i,j);
            }
        }
    }
    public void swap(char[] chars,int a,int b){
        char temp = chars[a];
        chars[a]=chars[b];
        chars[b]=temp;
    }
}
