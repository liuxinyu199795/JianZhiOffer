import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZuZhongChaoGuoYiBanDeShuZi028
 * @Author: XinyuLiu
 * @Date: 2019/7/6 23:34
 */
public class shuZuZhongChaoGuoYiBanDeShuZi028 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
                if(entry.getValue()>array.length/2){
                    return entry.getKey();
                }
        }
        return 0;
    }
}
