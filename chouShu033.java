import java.util.ArrayList;
import java.util.List;


/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: chouShu033
 * @Author: XinyuLiu
 * @Date: 2019/7/16 20:18
 */
public class chouShu033 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int i2=0,i3=0,i5=0;
        while(list.size()<index){
            int j2=list.get(i2)*2;
            int j3=list.get(i3)*3;
            int j5=list.get(i5)*5;
            int min = Math.min(j2,Math.min(j3,j5));
            list.add(min);
            if(j2==min) i2++;
            if(j3==min) i3++;
            if(j5==min) i5++;

        }
        return list.get(list.size()-1);
    }

}
