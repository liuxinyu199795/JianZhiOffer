import java.util.ArrayList;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaShuHeWeiMouYiZhiDeLuJin024
 * @Author: XinyuLiu
 * @Date: 2019/7/5 23:04
 */
public class erChaShuHeWeiMouYiZhiDeLuJin024 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    private ArrayList<ArrayList<Integer>> Arraylist = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null) return Arraylist;
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            Arraylist.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return Arraylist;
    }
}
