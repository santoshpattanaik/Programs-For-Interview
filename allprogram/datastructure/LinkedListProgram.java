package allprogram.datastructure;

public class LinkedListProgram {
    NodeElement head;
    public static void main(String[] args) {
        LinkedListProgram linkedList = new LinkedListProgram();
        linkedList.head = new NodeElement(1);
        NodeElement second = new NodeElement(2);
        NodeElement third = new NodeElement(3);
        linkedList.head.next = second;
        second.next=third;
        linkedList.printLinkedList();
    }

    private void printLinkedList() {
        NodeElement n = head;
        while (n!=null){
            System.out.print("Data: "+n.data+" Next Element: "+n.next);
            n=n.next;
            System.out.println();
        }
    }

    static class NodeElement {
        int data;
        NodeElement next;
        NodeElement(int data){
            this.data=data;
            next=null;
        }
    }
}
