/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: pingHengErChaShu039
 * @Author: XinyuLiu
 * @Date: 2019/7/18 1:12
 */
public class pingHengErChaShu039 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        depth(root);
        return isBalanced;
    }
    public int depth(TreeNode root){
        if (root==null) return 0;
        int left =depth(root.left);
        int right =depth(root.right);
        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return left>right?left+1:right+1;
    }
}
