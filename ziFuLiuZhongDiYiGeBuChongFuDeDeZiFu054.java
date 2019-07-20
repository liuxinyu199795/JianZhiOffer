import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: ziFuLiuZhongDiYiGeBuChongFuDeDeZiFu054
 * @Author: XinyuLiu
 * @Date: 2019/7/20 1:04
 */
public class ziFuLiuZhongDiYiGeBuChongFuDeDeZiFu054 {
    List<Character> list = new ArrayList<>();
    Map<Character,Integer> map = new HashMap<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char chars ='#';
        for (char key:list) {
            if(map.get(key)==1){
                chars=key;
                break;
            }
        }
        return chars;
    }
}
