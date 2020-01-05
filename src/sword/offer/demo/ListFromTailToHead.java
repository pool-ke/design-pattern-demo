package sword.offer.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author qianji
 * @date 2019/12/29 15:27
 */
public class ListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode nodeHead = listNode;
        while (nodeHead != null){
            result.add(nodeHead.val);
            nodeHead = nodeHead.next;
        }
        Collections.reverse(result);
        return result;
    }
}
