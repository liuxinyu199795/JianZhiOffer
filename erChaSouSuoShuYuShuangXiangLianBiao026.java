/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaSouSuoShuYuShuangXiangLianBiao026
 * @Author: XinyuLiu
 * @Date: 2019/7/6 15:24
 */
public class erChaSouSuoShuYuShuangXiangLianBiao026 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        Convert(pRootOfTree.left);
        if(right==null){
            left=right=pRootOfTree;
        }else{
            right.right=pRootOfTree;
            pRootOfTree.left=right;
            right=pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return left;
    }
}
