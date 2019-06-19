/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: heBingLiangGePaiXuLianBiao016
 * @Author: XinyuLiu
 * @Date: 2019/6/19 22:30
 */
public class heBingLiangGePaiXuLianBiao016 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode list = new ListNode(0);
        ListNode res =list;

        while(p!=null&&q!=null){
            if(p.val<=q.val){
                res.next=p;
                res=p;
                p=p.next;
            }else{
                res.next=q;
                res=q;
                q=q.next;
            }
        }
        if(p!=null){
            res.next=p;
        }
        if(q!=null){
            res.next=q;
        }
        return list.next;
    }
}
