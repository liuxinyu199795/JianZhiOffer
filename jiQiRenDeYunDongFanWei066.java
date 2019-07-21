/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: jiQiRenDeYunDongFanWei066
 * @Author: XinyuLiu
 * @Date: 2019/7/21 14:04
 */
public class jiQiRenDeYunDongFanWei066 {
    public int movingCount(int threshold, int rows, int cols){
        boolean[][] flag = new boolean[rows][cols];
        return count(0,0,rows,cols,threshold,flag);
    }
    public int count(int i,int j,int rows,int cols,int k,boolean[][] flag){
        if(i<0||j<0||i>=rows||j>=cols||num(i)+num(j)>k||flag[i][j]==true) return 0;
        flag[i][j]=true;
        return count(i-1,j,rows,cols,k,flag)+count(i,j-1,rows,cols,k,flag)
                +count(i+1,j,rows,cols,k,flag)+count(i,j+1,rows,cols,k,flag)+1;
    }
    public int num(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
