/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: erChaShuDeXiaYiGeJieDian057
 * @Author: XinyuLiu
 * @Date: 2019/7/20 14:37
 */
public class erChaShuDeXiaYiGeJieDian057 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null) return null;//节点为空
        //为父节点，有右子树，找右子树的最左节点
        if (pNode.right != null) {
            pNode=pNode.right;
            while(pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        //如果节点不是根节点
        while(pNode.next!=null){
            TreeLinkNode pRoot=pNode.next;//pNode的父节点
            if(pRoot.left==pNode){//如果pNode是根节点的左子树，直接返回根节点
                return pRoot;
            }
            pNode=pNode.next;//是根节点右子树则继续向上判断
        }
        return null;
    }
}
