/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuZuChaZhao001
 * @Author: XinyuLiu
 * @Date: 2019/6/13 21:58
 */
public class shuZuChaZhao001 {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0) return false;
        boolean isFind = false;
        int rows = array.length;
        int columns = array[0].length;
        int row = 0;
        int column=columns-1;
        while(row<rows&&column>=0){
            if(array[row][column]==target){
                isFind=true;
                return isFind;
            }else if(array[row][column]>target){
                column--;
            }else{
                row++;
            }
        }
    return isFind;
    }
}
