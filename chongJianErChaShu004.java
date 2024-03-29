import java.util.Arrays;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: chongJianErChaShu004
 * @Author: XinyuLiu
 * @Date: 2019/6/15 18:33
 */
public class chongJianErChaShu004 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
 }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0) return null;
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i <in.length ; i++) {
            if(pre[0]==in[i]){
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}
