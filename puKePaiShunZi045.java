import java.util.Arrays;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: puKePaiShunZi045
 * @Author: XinyuLiu
 * @Date: 2019/7/19 12:42
 */
public class puKePaiShunZi045 {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length!=5) return false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] num= new int[14];
        num[0]=-3;
        for (int i = 0; i <numbers.length ; i++) {
            num[numbers[i]]++;
            if(numbers[i]==0) continue;
            if(num[numbers[i]]>1) return false;
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        if(max-min<5){
            return true;
        }else{
            return false;
        }
    }
}
