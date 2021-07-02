/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution{
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  
  //如果你的parameter是linkedlist的话，就直接找到linkedlist的head作为l1和l2
  
        //初始化结果节点
        int nVal = l1.val+l2.val;
        int add = 0;
        if(nVal>=10) {

            nVal = nVal - 10;
            add = 1;
        }
  
    //我用三个node来表示iterate这个linkedlist，ret是head，old和new轮流交替往下找到需要add的node
        ListNode newNode = new ListNode(nVal);
        ListNode ret = newNode;
        ListNode oldNode = null;

        while (true) {
            oldNode = newNode;
          
          //用来判断是否需要breadk的if语句
            if(l1.next==null && l2.next==null){ //如果都没有下一个节点则退出

                if(add ==1) {
                    newNode = new ListNode(1);
                    oldNode.next = newNode;
                }
                break;
            }
          
            int v1 = 0;
            int v2 = 0;
            if(l1.next != null) { //如果还有l1
                l1 = l1.next;
                v1 = l1.val;
            }
            if(l2.next != null) { //如果还有l2
                l2 = l2.next;
                v2 = l2.val;
            }
            nVal = v1+v2+add;
            if(nVal>=10) {     //如果有进位则add为1

                nVal = nVal - 10;
                add = 1;
            }else
                add = 0;
            newNode = new ListNode(nVal);
            oldNode.next = newNode;
        }
        return ret;
    }
}
