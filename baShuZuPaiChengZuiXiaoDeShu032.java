/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: baShuZuPaiChengZuiXiaoDeShu032
 * @Author: XinyuLiu
 * @Date: 2019/7/16 16:35
 */
public class baShuZuPaiChengZuiXiaoDeShu032 {
    public String PrintMinNumber(int [] numbers) {
        StringBuffer str= new StringBuffer();
        //排序
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                int a =Integer.valueOf(numbers[i]+""+numbers[j]);
                int b =Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for (int i = 0; i <numbers.length; i++) {
            str.append(numbers[i]);
        }
        return str.toString();
    }
}
