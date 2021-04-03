package allprogram.backup;

public class QueueExmaple{
	 
    private int capacity;
    int queue[];
    int front = 0;
    int rare = -1;
    int currentsize = 0;
	public QueueExmaple(int queueSize){
		this.capacity = queueSize;
		queue = new int[this.capacity];
		
	}
	
	public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: "+item);
        } else {
        	rare++;
            if(rare == capacity-1){
            	rare = 0;
            }
            queue[rare] = item;
            currentsize++;
            System.out.println("Element " + item+ " is pushed to Queue !");
        }
    }
 
	
	public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Pop operation done ! removed: "+queue[front-1]);
                front = 0;
            } else {
                System.out.println("Pop operation done ! removed: "+queue[front-1]);
            }
            currentsize--;
        }
    }
	 public boolean isQueueFull(){
	        boolean status = false;
	        if (currentsize == capacity){
	            status = true;
	        }
	        return status;
	    }
	     
	    /**
	     * This method checks whether the queue is empty or not
	     * @return
	     */
	    public boolean isQueueEmpty(){
	        boolean status = false;
	        if (currentsize == 0){
	            status = true;
	        }
	        return status;
	    }
	     
    
	public static void main(String args[]) {
		
		QueueExmaple queue = new QueueExmaple(10);
		queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
			   }

}
