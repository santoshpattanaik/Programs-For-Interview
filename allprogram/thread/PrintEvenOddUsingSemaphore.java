package allprogram.thread;

import java.util.concurrent.Semaphore;

public class PrintEvenOddUsingSemaphore {
    public static void main(String[] args) {
        SemaphoreImpl semObj = new SemaphoreImpl();
        Thread t1 = new Thread(new OddRunnable(semObj,10),"OddThread");
        Thread t2 = new Thread(new EvenRunnable(semObj,10),"EvenThread");
        t1.start();
        t2.start();
    }
}
class SemaphoreImpl{
    private Semaphore evenSem = new Semaphore(0);
    private Semaphore oddSem = new Semaphore(1);
    public void printEven(int num) throws InterruptedException {
        evenSem.acquire();
        System.out.println(Thread.currentThread().getName()+" -> "+num);
        oddSem.release();
    }
    public void printOdd(int num) throws InterruptedException {
        oddSem.acquire();
        System.out.println(Thread.currentThread().getName()+" -> "+num);
        evenSem.release();
    }
}
class OddRunnable implements Runnable{
    SemaphoreImpl semaphore;
    int max;
    OddRunnable(SemaphoreImpl semaphore , int max){
        this.semaphore = semaphore;
        this.max = max;
    }
    @Override
    public void run() {
        for (int i = 1; i <= max; i+=2) {
            try {
                semaphore.printOdd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenRunnable implements Runnable {
    SemaphoreImpl semaphore;
    int max ;
    public EvenRunnable(SemaphoreImpl semaphore, int max) {
        this.semaphore=semaphore;
        this.max=max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i+=2) {
            try {
                semaphore.printEven(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}