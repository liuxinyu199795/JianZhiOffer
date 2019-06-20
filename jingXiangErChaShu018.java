/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: jingXiangErChaShu018
 * @Author: XinyuLiu
 * @Date: 2019/6/20 17:38
 */
public class jingXiangErChaShu018 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public void Mirror(TreeNode root) {
        if(root==null) return;
        TreeNode tmp = root.left;
        root.left=root.right;
        root.right=tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
