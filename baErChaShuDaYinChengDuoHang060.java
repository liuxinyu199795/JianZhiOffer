import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: baErChaShuDaYinChengDuoHang060
 * @Author: XinyuLiu
 * @Date: 2019/7/20 18:52
 */
public class baErChaShuDaYinChengDuoHang060 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(pRoot==null) return list;
        ArrayList<Integer> temp = new ArrayList<>();
        queue.add(pRoot);
        int num =1,count=0;
        while(!queue.isEmpty()){
            TreeNode node =queue.remove();
            temp.add(node.val);
            count++;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            if(count==num){
                System.out.println();
                count=0;
                num=queue.size();
                list.add(temp);
                temp = new ArrayList<>();
            }
        }
        return list;
    }

}
