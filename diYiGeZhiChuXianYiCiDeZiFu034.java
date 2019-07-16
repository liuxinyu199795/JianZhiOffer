import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: diYiGeZhiChuXianYiCiDeZiFu034
 * @Author: XinyuLiu
 * @Date: 2019/7/16 23:12
 */
public class diYiGeZhiChuXianYiCiDeZiFu034 {
    public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0) return -1;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            map.put(str.charAt(i),(map.get(str.charAt(i))==null?1:map.get(str.charAt(i))+1));
        }
        for (int i = 0; i <str.length() ; i++) {
            if(map.get(str.charAt(i))==1){
                return i+1;
            }
        }
        return -1;
    }
}
