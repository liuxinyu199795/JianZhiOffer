import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: liangGeLianBiaoDeDiYiGeGongGongJieDian036
 * @Author: XinyuLiu
 * @Date: 2019/7/17 16:53
 */
public class liangGeLianBiaoDeDiYiGeGongGongJieDian036 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    //1.Set存储法
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur1=pHead1;
        ListNode cur2=pHead2;
        while(cur1!=null){
            set.add(cur1);
            cur1=cur1.next;
        }
        while(cur2!=null){
            if(set.contains(cur2)) return cur2;
            cur2=cur2.next;
        }
        return null;
    }
    //2.长度相同后再遍历
    /*public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1=pHead1;
        ListNode cur2=pHead2;
        int length1=FindLength(cur1);
        int length2=FindLength(cur2);
        if(length1>=length2){
            int length=length1-length2;
            while(length>0){
                cur1=cur1.next;
                length--;
            }
        }else{
            int length=length2-length1;
            while(length>0){
                cur2=cur2.next;
                length--;
            }
        }
        while(cur1!=cur2&&cur1!=null){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;

    }
    public int FindLength(ListNode pHead){
        int length=0;
        ListNode p =pHead;
        while(p!=null){
            length++;
            p=p.next;
        }
        return length;
    }*/
}
