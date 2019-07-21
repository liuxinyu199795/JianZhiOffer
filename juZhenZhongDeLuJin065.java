/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: juZhenZhongDeLuJin065
 * @Author: XinyuLiu
 * @Date: 2019/7/21 13:24
 */
public class juZhenZhongDeLuJin065 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                //循环遍历二维数组，找到起点等于str第一个元素，在递归判断其他元素
                if(judge(matrix,i,j,rows,cols,flag,str,0)) return true;
            }
        }
        return false;
    }
    public boolean judge(char[] matrix,int i,int j, int rows, int cols, boolean[] flag, char[] str,int k){
        //转换成一维数组的下标
        int index=i*cols+j;
        if(i<0||j<0||i>=rows||j>=cols||matrix[index]!=str[k]||flag[index]==true) return false;
        if(k==str.length-1) return true;
        flag[index]=true;
        //回溯，递归寻找，找到了就给k+1，找不到就还原
        if(judge(matrix,i-1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i+1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j-1,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j+1,rows,cols,flag,str,k+1)  )
        {
            return true;
        }
        //找不到就还原
        flag[index]=false;
        return false;
    }
}
