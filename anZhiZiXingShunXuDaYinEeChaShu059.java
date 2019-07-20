import java.util.ArrayList;
import java.util.Stack;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: anZhiZiXingShunXuDaYinEeChaShu059
 * @Author: XinyuLiu
 * @Date: 2019/7/20 17:07
 */
public class anZhiZiXingShunXuDaYinEeChaShu059 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int num=1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();//存奇数层
        stack1.push(pRoot);
        Stack<TreeNode> stack2 = new Stack<>();//存偶数层
        while(!stack1.empty()||!stack2.empty()){
            if(num%2==1){
                ArrayList<Integer> temp = new ArrayList<>();
                while(!stack1.empty()){
                    TreeNode node=stack1.pop();
                    if(node!=null){
                        temp.add(node.val);
                        System.out.print(node.val+" ");
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
                if(!temp.isEmpty()){
                    list.add(temp);
                    num++;
                    System.out.println();
                }
            }
            if(num%2==0){
                ArrayList<Integer> temp = new ArrayList<>();
                while(!stack2.empty()){
                    TreeNode node=stack2.pop();
                    if(node!=null){
                        temp.add(node.val);
                        System.out.print(node.val+" ");
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                if(!temp.isEmpty()){
                    list.add(temp);
                    num++;
                    System.out.println();
                }
            }
        }
        return list;
    }
}
