import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: duiChenDeErChaShu058
 * @Author: XinyuLiu
 * @Date: 2019/7/20 15:31
 */
public class duiChenDeErChaShu058 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //1.递归版本
    /*boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null) return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean isSymmetrical(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        return left.val==right.val&&isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
    }*/
    //2.DFS非递归，用栈实现
    /*boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.left);
        stack.push(pRoot.right);
        while(!stack.empty()){
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if(right==null&&left==null) continue;
            if(right==null||left==null) return false;
            if(right.val!=left.val) return false;
            stack.push(right.right);
            stack.push(left.left);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }*/
    //3.BFS非递归，用队列实现
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot.left);
        queue.add(pRoot.right);
        while(queue.size()!=0){
            TreeNode right =queue.poll();
            TreeNode left =queue.poll();
            if(right==null&&left==null) continue;
            if(right==null||left==null) return false;
            if(right.val!=left.val) return false;
            queue.add(right.right);
            queue.add(left.left);
            queue.add(right.left);
            queue.add(left.right);
        }
        return true;
    }
}
