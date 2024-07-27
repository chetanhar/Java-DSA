package LinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    private void insertLast(int val){
        Node node=new Node(val);
        Node last =head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void insert(int after, int val){
        Node preNode=find(after);
        Node node=new Node(val);
        node.next=preNode.next;
        preNode.next=node;
        node.prev=preNode;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    private Node find(int after) {
        Node node=head;
        while(node!=null){
            if(node.value==after){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

