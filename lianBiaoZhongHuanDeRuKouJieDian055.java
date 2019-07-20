/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: lianBiaoZhongHuanDeRuKouJieDian055
 * @Author: XinyuLiu
 * @Date: 2019/7/20 1:32
 */
public class lianBiaoZhongHuanDeRuKouJieDian055 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead.next==null) return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(slow!=null&&fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=pHead;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                if(slow==fast){
                    return slow;
                }
            }
        }
        return null;
    }
}
