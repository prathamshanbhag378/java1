class MThread extends Thread{
    public MThread(String name){
        super(name);
        start();
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Child Thread interupted");
            }
        }
    }
}
public class T12 {
    public static void main(String[] args) {
        MThread thread=new MThread("Child Thread");
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Main Thread interupted");
            }
        }
    }
}
