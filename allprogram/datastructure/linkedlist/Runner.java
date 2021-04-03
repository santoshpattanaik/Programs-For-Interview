package allprogram.datastructure.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }
        list.show();
//        list.delete(0);
//        list.show();
//        list.delete(5);
//        list.show();
//        list.delete(8);
//        list.show();
        list.insertAt(0,10);
        list.show();
        list.searchElementAt(5);
    }
}
