package allprogram.datastructure.stack;

public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("hello");
        super.finalize();
    }
}
class StackImpl {
    StackNode root;
    public void push(int data){
        StackNode newObj = new StackNode(data);
        if(root == null){
            root = newObj;
        }
        else {
            StackNode temp = root;
            root=newObj;
            root.next = temp;
        }
    }
    public int pop(){
        int element = Integer.MIN_VALUE;
        if (root == null)
            System.out.println("Stack is empty");
        else {
            element = root.data;
            root = root.next;
        }
        return element;
    }

}

class StackNode{
    int data;
    StackNode next;
    public StackNode(int data) {
        this.data = data;
    }
}