package allprogram.backup;

import java.util.NoSuchElementException;

public class DequeueImplementation {
	
	private final int arr[];
    private int head;
    private int size;

    public DequeueImplementation(int capacity) {
        arr = new int[capacity];
    }

    public void addLast(int element) {
        checkCapacity();
        arr[(head + size++) % arr.length] = element;
    }

    public void addFirst(int element) {
        checkCapacity(); 

        if (head == 0) {
            arr[(head = arr.length - 1)] = element;
        } else {
            arr[(--head) % arr.length] = element;
        }

        size++;
    }

    public int removeFirst() {
        checkNotEmpty();

        int ret = arr[head];
        head = (head + 1) % arr.length;
        size--;
        return ret;
    }

    public int removeLast() {
        checkNotEmpty();

        int ret = arr[(head + size - 1) % arr.length];
        size--;
        return ret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; ++i) {
            sb.append(arr[(head + i) % arr.length]);

            if (i < size - 1) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }

    public int size() {
        return size;
    }

    private void checkCapacity() {
        if (arr.length == size) {
            throw new IllegalStateException("No more space is available.");
        }
    }

    private void checkNotEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("Trying to pop an empty deque.");
        }
    }

    public static void main(String args[]) {
        DequeueImplementation deque = new DequeueImplementation(10);
       
               
              		System.out.print("Adding  to front: ");
                        deque.addFirst(1);
                        System.out.println(deque);
      
                       System.out.print("Adding   to back:  ");
                       deque.addLast(5);
                        System.out.println(deque);
                        
                    	System.out.print("Adding  to front: ");
                        deque.addFirst(4);
                        System.out.println(deque);
      
                     /*  System.out.print("Adding   to back:  ");
                       deque.addLast(5);
                        System.out.println(deque);
                    	System.out.print("Adding  to front: ");
                        deque.addFirst(1);
                        System.out.println(deque);
      
                       System.out.print("Adding   to back:  ");
                       deque.addLast(5);
                        System.out.println(deque);*/
                   

                   
                        System.out.print("Removing from front: ");
                        deque.removeFirst();
                        System.out.println(deque);
//                 
//                        System.out.print("Removing from back:  ");
//                        deque.removeLast();
//                        System.out.println(deque);
                    
                
    }	
}
