import java.util.ArrayList;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shunShiZhenDaYinJuZhen019
 * @Author: XinyuLiu
 * @Date: 2019/6/22 20:57
 */
public class shunShiZhenDaYinJuZhen019 {
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null||matrix.length==0) return new ArrayList<>();
        int tR = 0;
        int tC = 0;
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;
        while (tR<=dR&&tC<=dC){
            print(matrix,tR++,tC++,dR--,dC--);
        }
        return res;
    }
    public void print(int[][] num,int tR,int tC,int dR,int dC){
        if(tR==dR){//当只剩下一行
            for (int i = tC; i <=dC; i++) {
                res.add(num[tR][i]);
            }
        }else if(tC==dC){//当只剩下一列
            for (int i = tR; i <=dR; i++) {
                res.add(num[i][tC]);
            }
        }else{
            int curR=tR;//临时创建变量来记
            int curC=tC;
            while(curC!=dC){
                res.add(num[tR][curC]);//从左到右
                curC++;
            }
            while(curR!=dR){
                res.add(num[curR][dC]);//从上到下
                curR++;
            }

            while(curC!=tC){
                res.add(num[dR][curC]);//从右到左
                curC--;
            }
            while(curR!=tR){
                res.add(num[curR][tC]);//从下到上
                curR--;
            }
        }
    }
}
