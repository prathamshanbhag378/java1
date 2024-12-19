class mRunnable implements Runnable{
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Thread"+Thread.currentThread().getName()+"running....");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class J11 {
    public static void main(String[] args) {
        mRunnable m2=new mRunnable();
        Thread t1=new Thread(m2);
        Thread t2=new Thread(m2);
        Thread t3=new Thread(m2);
        t1.start();
        t2.start();
        t3.start();
    }
}
