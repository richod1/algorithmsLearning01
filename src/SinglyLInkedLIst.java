class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SinglyLInkedLIst {
    private Node head;

    public SinglyLInkedLIst(){
        this.head=null;
    }
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next !=null){
                current=current.next;
            }
            current.next=newNode;
        }
        System.out.println();
    }

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next=newNode;
    }
    public static void main(String[] args){
        SinglyLInkedLIst list=new SinglyLInkedLIst();
        list.insertAtEnd(100);
        list.insert(70);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();

    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;

        }
        System.out.println();
    }

    public void insertAtPosition(int data,int position){
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            insertAtBeginning(data);
            return;
        }

        Node newNode=new Node(data);
        Node current=head;
        int currentPosition=0;
        while(currentPosition < position -1 && current !=null){
            current=current.next;
            currentPosition++;
        }
        if(current==null){
            System.out.println("Invalid position");
            return;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    
}
