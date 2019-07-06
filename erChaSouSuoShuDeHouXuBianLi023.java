import java.util.Arrays;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaSouSuoShuDeHouXuBianLi023
 * @Author: XinyuLiu
 * @Date: 2019/7/5 19:42
 */
public class erChaSouSuoShuDeHouXuBianLi023 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0||sequence==null) return false;
        return isTree(sequence,0,sequence.length-1);
    }
    public boolean isTree(int[] nums,int start,int end){
        if(start>=end){
            return true;
        }
        int root = nums[end];
        int i=0;
        for (i = start; i <end ; i++) {
            if(nums[i]>root) break;
        }
        for (int j = i; j <end ; j++) {
            if (nums[j] < root) return false;
        }
        boolean left = isTree(nums,start,i-1);
        boolean right = isTree(nums,i,end-1);
        return left&&right;
    }
}
