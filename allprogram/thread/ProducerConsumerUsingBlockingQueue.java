package allprogram.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }

}

class Producer implements Runnable {
    private BlockingQueue<Integer> obj;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                obj.put(i);
                System.out.println("Producer Produced: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    Producer(BlockingQueue<Integer> obj) {
        this.obj = obj;
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> obj;
    int taken = -1;

    @Override
    public void run() {
        while (taken != 5) {
            try {
                taken = obj.take();
                System.out.println("Consumer Consumed: " + taken);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    Consumer(BlockingQueue<Integer> obj) {
        this.obj = obj;
    }
}