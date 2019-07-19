import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZuZhongZhiChuXianYiCiDeShuZi040
 * @Author: XinyuLiu
 * @Date: 2019/7/18 1:38
 */
public class shuZuZhongZhiChuXianYiCiDeShuZi040 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2) return;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            map.put(array[i],(map.containsKey(array[i])==false?1:map.get(array[i])+1));
        }
        int[] num = new int[2];
        int k=0;
        for (Map.Entry<Integer,Integer> m:map.entrySet()) {
            if(m.getValue()==1){
                num[k++]=m.getKey();
            }
        }
        num1[0]=num[0];
        num2[0]=num[1];
    }
}
