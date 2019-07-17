import java.util.LinkedList;
import java.util.Queue;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaShuDeShenDu038
 * @Author: XinyuLiu
 * @Date: 2019/7/17 20:34
 */
public class erChaShuDeShenDu038 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    //递归版本
    /*public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        int left =TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }*/
    //非递归版本
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=0,count=0,nextCount=1;
        while(queue.size()!=0){
            TreeNode top = queue.poll();
            count++;
            if(top.left!=null){
                queue.add(top.left);
            }
            if(top.right!=null){
                queue.add(top.right);
            }
            if(count==nextCount){
                depth++;
                count=0;
                nextCount=queue.size();
            }
        }
        return depth;
    }
}
