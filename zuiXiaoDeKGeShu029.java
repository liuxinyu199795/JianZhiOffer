import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: zuiXiaoDeKGeShu029
 * @Author: XinyuLiu
 * @Date: 2019/7/7 0:11
 */
public class zuiXiaoDeKGeShu029 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null||input.length==0||k==0||input.length<k) return list;
        Arrays.sort(input);
        for (int i = 0; i <input.length ; i++) {
            if(i==k) break;
            list.add(input[i]);
        }
        return list;
    }
}
