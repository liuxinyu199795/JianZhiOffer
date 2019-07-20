/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: xuLieHuaErChaShu061
 * @Author: XinyuLiu
 * @Date: 2019/7/20 21:35
 */
public class xuLieHuaErChaShu061 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    int index=-1;
    String Serialize(TreeNode root) {
        StringBuffer str = new StringBuffer();
        if(root==null){
            str.append("#,");
            return str.toString();
        }
        str.append(root.val+",");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        return str.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        if(index>=str.length()){
            return null;
        }
        String[] strings = str.split(",");
        TreeNode node =null;
        if(!strings[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strings[index]));
            node.left=Deserialize(str);
            node.right=Deserialize(str);
        }
        return node;
    }
}
