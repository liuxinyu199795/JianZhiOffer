/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shuDeZiJieGou017
 * @Author: XinyuLiu
 * @Date: 2019/6/19 23:46
 */
public class shuDeZiJieGou017 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val){
                result=isSubtree(root1,root2);
            }
            if(!result){
                result=HasSubtree(root1.left,root2);
            }
            if(!result){
                result=HasSubtree(root1.right,root2);
            }
        }
        return result;
    }
    public boolean isSubtree(TreeNode node1,TreeNode node2){
        if(node2==null){
            return true;
        }
        if(node1==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        return isSubtree(node1.left,node2.left)&&isSubtree(node1.right,node2.right);
    }
}
