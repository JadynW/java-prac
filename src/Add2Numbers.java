import java.util.ArrayList;
import java.util.List;

public class Add2Numbers {

    ListNode l10 = new ListNode(3);
    ListNode l11 = new ListNode(4, l10);
    ListNode l1 = new ListNode(2, l11);

    ListNode l20 = new ListNode(4);
    ListNode l21 = new ListNode(6, l20);
    ListNode l2 = new ListNode(5, l21);

    public Add2Numbers(){}

    public class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode add(){

        int cur_val = (l1.val + l2.val)%10;
        int carry = (l1.val + l2.val)/10;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(cur_val);

        while(l1.next != null || l2.next != null || carry != 0){
            if (l1.next == null){
                l1.next = new ListNode(0);
            }
            if (l2.next == null){
                l2.next = new ListNode(0);
            }
            cur_val = (l1.next.val + l2.next.val + carry)%10;
            carry = (l1.next.val + l2.next.val + carry)/10;
            res.add(cur_val);
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode sum = new ListNode(res.get(res.size()-1));
        for (int i = res.size()-2; i >= 0; i--){
            sum = new ListNode(res.get(i), sum);
        }

        return sum;
    }

}
