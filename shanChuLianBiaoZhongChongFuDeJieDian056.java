import java.util.List;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: shanChuLianBiaoZhongChongFuDeJieDian056
 * @Author: XinyuLiu
 * @Date: 2019/7/20 12:57
 */
public class shanChuLianBiaoZhongChongFuDeJieDian056 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null) return pHead;
        ListNode pre = new ListNode(-1);
        pre.next=pHead;
        ListNode cur=pre;
        ListNode last=pre.next;
        while(last!=null){
            if(last.next!=null&&last.val==last.next.val){
                while(last.next!=null&&last.val==last.next.val){
                    last=last.next;//找到重复的最后一个节点
                }
                cur.next=last.next;
                last=last.next;
            }else{
                cur=cur.next;
                last=last.next;
            }
        }
        return pre.next;
    }
}
