import java.util.ArrayList;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: heWeiSDeLianXuZhengShuXuLie041
 * @Author: XinyuLiu
 * @Date: 2019/7/18 15:36
 */
public class heWeiSDeLianXuZhengShuXuLie041 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low=1,high=2;
        while(low<high){
            int num=(low+high)*(high-low+1)/2;//和
            if(num==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <=high ; i++) {
                    list.add(i);
                }
                res.add(list);
                low++;
            }else if(num<sum){
                high++;
            }else{
                low++;
            }
        }
        return res;
    }
}
