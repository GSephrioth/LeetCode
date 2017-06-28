package Medium;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x1,int x2,int x3){
        this.val = x1;
        this.next = new ListNode(x2);
        this.next.next = new ListNode(x3);
    }

    void addTail(int val){
        ListNode temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new ListNode(val);
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()) return false;
        else {
            ListNode temp = this;
            ListNode ins = (ListNode)obj;
            while(temp.next != null){
                if(temp.val != ins.val)
                    return false;
                temp = temp.next;
                ins = ins.next;
            }
            return true;
        }
    }
}

class AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        // l2 过长
        while(l1.next == null && l2.next != null){
            l2 = l2.next;
            single = (l2.val+tens)%10;
            result.next = new ListNode(single);
            result = result.next;
            tens = (l2.val+tens)/10;
        }
        // l1 过长
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
}