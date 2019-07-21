import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: huaDongChuangKouDeZuiDaZhi064
 * @Author: XinyuLiu
 * @Date: 2019/7/21 12:43
 */
public class huaDongChuangKouDeZuiDaZhi064 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        //双端队列，用来记录每个窗口的最大值下标
        LinkedList<Integer> qmax = new LinkedList<>();
        if(num==null||num.length==0||size<=0||num.length<size){
            return res;
        }
        int index=0;
        for (int i = 0; i <num.length ; i++) {
            while (!qmax.isEmpty()&&num[qmax.peekLast()]<num[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-size){
                qmax.pollFirst();
            }
            if(i>=size-1){
                res.add(num[qmax.peekFirst()]);
            }
        }
        return res;
    }
}
