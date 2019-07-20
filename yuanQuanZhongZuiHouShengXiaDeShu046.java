/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: yuanQuanZhongZuiHouShengXiaDeShu046
 * @Author: XinyuLiu
 * @Date: 2019/7/19 13:56
 */
public class yuanQuanZhongZuiHouShengXiaDeShu046 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) return -1;
        int[] num = new int[n];
        int i=-1,deep=0,count=n;
        while(count>0){
            i++;
            if(i>=n) i=0;//模拟环
            if(num[i]==-1) continue;//跳过已删除的小孩子
            deep++;//记录已走过的
            if(deep==m){
                num[i]=-1;
                deep=0;
                count--;//去掉一个小孩子
            }
        }
        return i;
    }
}
