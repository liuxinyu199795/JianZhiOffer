/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: xuanZhuanShuZuDeZuiXiaoShuZi006
 * @Author: XinyuLiu
 * @Date: 2019/6/16 21:32
 */
public class xuanZhuanShuZuDeZuiXiaoShuZi006 {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        int left=0,right=length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }else if(array[mid]<array[right]){
                right=mid;
            }else{
                right=right-1;
            }
        }
        return array[left];
    }
}
