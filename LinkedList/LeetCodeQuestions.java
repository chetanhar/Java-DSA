package LinkedList;

import java.util.List;

public class LeetCodeQuestions {

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(9);
        ListNode l3=new ListNode(9);
        ListNode l7=new ListNode(9);
        ListNode l8=new ListNode(9);
        ListNode l9=new ListNode(9);
        ListNode l10=new ListNode(9);
        ListNode l11=new ListNode(9);
        ListNode l12=new ListNode(9);
        ListNode l13=new ListNode(9);

        ListNode l4=new ListNode(9);
//        ListNode l5=new ListNode(8);
//        ListNode l6=new ListNode(2);
        l1.next=l2;
        l2.next=l3;
        l3.next=l7;
        l7.next=l8;
        l8.next=l9;
        l9.next=l10;
        l10.next=l11;
        l11.next=l12;
        l12.next=l13;
//        l4.next=l5;
//        l5.next=l6;
        LeetCodeQuestions lq= new LeetCodeQuestions();
//        lq.dispaly(l1);
//        lq.reverseKGroup(l1,3);
       // lq.reverseList(l1);
        ListNode o=lq.addTwoNumbers(l1,l4);
        lq.dispaly(o);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode tmp=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            ListNode node=new ListNode(sum%10);
            carry=sum/10;
            tmp.next=node;
            tmp=tmp.next;
        }
        return dummy.next;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }

        return a;
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode even=head;
        ListNode odd=head.next;
        while(even!=null&&even.next!=null){
            even.next=even.next.next;
        }
        even.next=odd;
        while(odd!=null&&odd.next!=null){
            odd.next=odd.next.next;
        }
        return even;
    }
    public void dispaly(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val + "->");
            tmp = tmp.next;
        }
        System.out.println("END");
    }

    // https://leetcode.com/problems/linked-list-cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // https://www.geeksforgeeks.org/problems/find-length-of-loop/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            int count = 0;
            if (fast == slow) {
                do {
                    slow = slow.next;
                    count++;
                } while (fast != slow);
                return count;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = lengthCycle(head);
        ListNode f = head;
        ListNode s = head;

        if (length == 0) {
            return null;
        }
        while (length > 0) {
            s = s.next;
            length--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // https://leetcode.com/problems/happy-number/description/
    public boolean isHappy(int val) {
        int f = val;
        int s = val;
        do {
            s = findSquare(val);
            f = findSquare(findSquare(val));
        }
        while (f != s);
        if (s == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int val) {
        int ans = 0;
        while (val > 0) {
            int rem = val % 10;
            ans += rem * rem;
            val /= 10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    // https://leetcode.com/problems/sort-list/
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
            } else {
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }
        tail.next = (left != null) ? left : right;
        return dummyNode.next;

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    // https://leetcode.com/problems/reverse-linked-list/submissions/
    // google, apple, amazon, microsoft
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode node = head;
        ListNode secondHead = reverseList(head);
        ListNode reverseHead = secondHead;
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(reverseHead);
        return head == null || secondHead == null;

    }
    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }


    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }


    // https://leetcode.com/problems/rotate-list/description/
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int rotation = k % length;
        ListNode newLast = head;
        for (int i = 0; i < length - rotation - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }

    // https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode firstHead = head;
        while (firstHead != null && secondHead != null) {
            ListNode tmp=firstHead.next;
            firstHead.next=secondHead;
            firstHead=tmp;
            tmp=secondHead.next;
            secondHead.next=firstHead;
            secondHead=tmp;
        }
        if (firstHead != null) {
            firstHead.next=null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f=head;
        int count=1;
        while(f.next!=null){
            f=f.next;
            count++;
        }
        ListNode newNode=head;
        for(int i=0;i<count-n-1;i++){
            newNode=newNode.next;
        }if(newNode.next!=null&&newNode.next.next!=null){
            newNode.next=newNode.next.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
