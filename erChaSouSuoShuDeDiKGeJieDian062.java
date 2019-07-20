import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaSouSuoShuDeDiKGeJieDian062
 * @Author: XinyuLiu
 * @Date: 2019/7/20 22:10
 */
public class erChaSouSuoShuDeDiKGeJieDian062 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //1.递归
    /*int index =0;//计数器
    TreeNode KthNode(TreeNode root, int k)
    {
        TreeNode node=KthNode(root.left,k);
        if(node!=null) return node;
        index++;
        if(index==k) return root;
        node=KthNode(root.right,k);
        if(node!=null) return node;
        return null;
    }*/
    //2.非递归
    TreeNode KthNode(TreeNode root, int k) {
        if(root==null||k<=0) return null;
        Stack<TreeNode> stack = new Stack<>();
        int count=0;
        TreeNode node =root;
        while(node!=null||!stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node = stack.pop();
                count++;
                if(count==k) return node;
                node = node.left;
            }
        }
        return null;
    }
}
