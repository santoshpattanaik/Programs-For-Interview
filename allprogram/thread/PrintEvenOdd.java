package allprogram.thread;

public class PrintEvenOdd {

    int count=1;
    int max=10;
    boolean odd=false;

    public static void main(String[] args) {
        PrintEvenOdd printObject = new PrintEvenOdd();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                printObject.printEven();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printObject.printOdd();
            }
        });
        t1.start();
        t2.start();
    }
    public void printEven(){
        System.out.println("Control Comes Here at Print Even");
        System.out.println("status:" +odd);
        synchronized (this){
            System.out.println("Control Comes Here at Print Even Synchronized ");

            while (count<max){
                System.out.println("Control Comes Here at Print Even while ");
                while (!odd){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count+" - Printing Even");
                count++;
                odd=false;
                notify();
            }
        }
    }
    public void printOdd(){
        System.out.println("Control Comes Here at Print Odd");
        System.out.println("status:" +odd);
        synchronized (this){
            System.out.println("Control Comes Here at Print Odd Synchronized ");

            while (count<max){
                System.out.println("Control Comes Here at Print Odd while ");
                while (odd){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count+" - Printing Odd");
                count++;
                odd=true;
                notify();
            }
        }
    }
}
