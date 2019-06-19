import java.util.Arrays;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: tiaoZhengShuZuShunXu013
 * @Author: XinyuLiu
 * @Date: 2019/6/19 13:59
 */
public class tiaoZhengShuZuShunXu013 {
    //1.创建新数组，用空间换时间，O(n)的时空复杂度
    /*public static void reOrderArray(int [] array) {
        int[] res = new int[array.length];
        int j=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==1){
                res[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0){
                res[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            array[i]=res[i];
        }
    }*/

    //2.对原数组进行交换，先找到一个奇数，然后依次跟前面的偶数进行交换
    public static void reOrderArray(int [] array) {
        if(array==null||array.length==0) return;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==1){
                int k=i;
                for (int j = i-1; j >=0 ; j--) {
                    if(array[j]%2==0){
                        int temp =array[k];
                        array[k]=array[j];
                        array[j]=temp;
                        k=j;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        reOrderArray(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
}
