class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}



public class LinkedList {
    ListNode head;

    public void insert(int val){
        // inserting new Node
        ListNode newNode=new ListNode(val);

        if(head==null){
            head=newNode;
        }else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // method to display || traversing
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        // singly linked list implementation

        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println("Linked List:");
        linkedList.display();

    }
    
}
