package Medium;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x,int y,int z){
        this.val = x;
        this.next = new ListNode(y);
        this.next.next = new ListNode(z);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null){
            sb.append(current.val);
            current = current.next;
        }
        return sb.toString();
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int single = (l1.val+l2.val)%10; //当前位
        int tens = (l1.val+l2.val)/10;   //进位

        ListNode result = new ListNode(single);
        ListNode root = result;
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            single = (l1.val+l2.val+tens)%10;
            result.next = new ListNode(single);
            result = result.next;
            tens = (l1.val+l2.val+tens)/10;
        }
        // l1,l2 过长
        while(l1.next == null && l2.next != null){
            l2 = l2.next;
            single = (l2.val+tens)%10;
            result.next = new ListNode(single);
            result = result.next;
            tens = (l2.val+tens)/10;
        }
        while(l1.next != null && l2.next == null){
            l1 = l1.next;
            single = (l1.val+tens)%10;
            result.next = new ListNode(single);
            result = result.next;
            tens = (l1.val+tens)/10;
        }
        // 最后有进位
        if(tens == 1){
            result.next = new ListNode(1);
        }
        return root;
    }

    public static void main(String args[]){
        ListNode a = new ListNode(2,4,3);
        ListNode b = new ListNode(5,6,4);
        AddTwoNumbers ATN = new AddTwoNumbers();
        System.out.println(ATN.addTwoNumbers(a,b));

    }
}