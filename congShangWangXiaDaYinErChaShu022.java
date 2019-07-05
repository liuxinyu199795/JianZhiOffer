import java.util.ArrayList;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: congShangWangXiaDaYinErChaShu022
 * @Author: XinyuLiu
 * @Date: 2019/6/23 16:24
 */
public class congShangWangXiaDaYinErChaShu022 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.remove(0);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
            list.add(tmp.val);
        }
        return list;
    }
}
