/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: lianBiaoZhongDaoShuKJieDian014
 * @Author: XinyuLiu
 * @Date: 2019/6/19 18:35
 */

public class lianBiaoZhongDaoShuKJieDian014 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0) return null;
        ListNode p = head;
        ListNode q = head;
        for (int i = 1; i <k ; i++) {
            if(p.next!=null){
                p=p.next;
            }else{
                return null;
            }
        }
        while(p.next!=null){
            p=p.next;
            q=q.next;
        }
        return q;
    }
}
