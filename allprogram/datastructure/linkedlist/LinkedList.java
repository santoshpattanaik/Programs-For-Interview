package allprogram.datastructure.linkedlist;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        if(head==null)
            head=node;
        else {
            Node n = head;
            while (n.next !=null)
                n=n.next;
            n.next=node;
        }
    }
    public void insertAt(int position,int data){
        Node node = new Node(data);
        Node n = head;
        Node prev=null;
        int count=0;
        if (position==0){
            node.next=head;
            head=node;
        }else {
            while (n!=null) {
                count++;
                prev = n;
                if (count - 1 == position) {

                }
                n = n.next;
            }
        }

    }
    public void show(){
        Node node = head;
        System.out.println("Linked List Elements: ");
        while (node!=null) {
            System.out.print(node.data);
            node = node.next;
            if(node!= null)
                System.out.print(" -> ");
        }
        System.out.println();
    }
    public void delete(int data){
        System.out.println("Deleteting "+data+" from Linked List");
        Node temp = head;
        Node prev=null;
        if (head.data == data) {
            head=head.next;
        }
        while (temp.data != data){
            prev=temp;
            temp=temp.next;
/*            System.out.println(prev.data);
            System.out.println(temp.data);*/
        }
        if (prev != null)
            prev.next=temp.next;
    }

    public void searchElementAt(int index) {
        int i = index;
        int count =0;
        Node node = head;
        while (node!= null){
            if(count==i) {
                System.out.println(node.data);
                break;
            }
            count++;
            node=node.next;
            //Object
        }
    }
}
