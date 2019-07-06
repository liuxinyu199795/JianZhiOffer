/**
 * @ProjectName: JianZhiOffer
 * @Package: PACKAGE_NAME
 * @ClassName: fuZhaLianBiaoDeFuZhi025
 * @Author: XinyuLiu
 * @Date: 2019/7/6 11:50
 */
public class fuZhaLianBiaoDeFuZhi025 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        RandomListNode cur = pHead;
        //1.复制旧链表，创建新链表
        while (cur!=null){
            RandomListNode node = new RandomListNode(cur.label);
            RandomListNode next = cur.next;
            cur.next=node;
            node.next=next;
            cur=next;
        }
        //2.初始化新链表的random指针
        cur=pHead;
        while(cur!=null){
            cur.next.random=cur.random==null?null:cur.random.next;
            cur=cur.next.next;
        }
        //3.拆分两个链表
        cur=pHead;
        RandomListNode clone = pHead.next;
        while (cur!=null){
            RandomListNode node = cur.next;
            RandomListNode next = cur.next.next;
            cur.next=node.next;
            node.next=node.next==null?null:node.next.next;
            cur=next;
        }
        return clone;
    }
}
