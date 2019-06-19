/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: fanZhuanLianBiao015
 * @Author: XinyuLiu
 * @Date: 2019/6/19 20:49
 */
public class fanZhuanLianBiao015 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        ListNode pre=null;
        ListNode next=null;

        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
