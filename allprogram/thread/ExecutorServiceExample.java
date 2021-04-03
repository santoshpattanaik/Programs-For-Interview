package allprogram.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread("Thread->"+i);
            executorService.submit(worker);
        }
        executorService.shutdown();
    }
}
class WorkerThread implements Runnable{

    WorkerThread(String name){
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello - "+i+" -> "+Thread.currentThread().getName());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
