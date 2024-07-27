package LinkedList;

public class LLclone {

    private Node head;
    private Node tail;

    private int size;

    public LLclone() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
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

    public void insert(int val, int index) {
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        Node node = new Node(val, tmp.next);
        tmp.next = node;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRecu(val, index, head);
    }

    private Node insertRecu(int val, int index, Node node) {
        if (index == 0) {
            Node tmp = new Node(val, node);
            size++;
            return tmp;
        }
        node.next = insertRecu(val, index - 1, node.next);
        return node;
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static LLclone mergeTwoSortedList(LLclone first, LLclone second) {
        Node f = first.head;
        Node s = second.head;
        LLclone ans = new LLclone();
        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            }
            else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size) {
            deleteLast();
        }
        Node prev = get(index - 1);
        prev.next = get(index).next;
        size--;
        return get(index).val;
    }


    private Node get(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;

    }

    private Node find(int val) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.val == val) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print("END");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LLclone lclone = new LLclone();
        lclone.insertLast(1);
        lclone.insertLast(1);
        lclone.insertLast(2);
        lclone.insertLast(2);
        lclone.insertLast(3);
        lclone.insertLast(3);
        //lclone.display();
        lclone.removeDuplicates();
        System.out.println();
        //lclone.display();
        LLclone first=new LLclone();
        LLclone second=new LLclone();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        second.insertLast(1);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(9);
        System.out.println();
        //first.display();
        //System.out.println();
        //second.display();
        //System.out.println();
        LLclone ans=LLclone.mergeTwoSortedList(first,second);
        //ans.display();

    }
}
