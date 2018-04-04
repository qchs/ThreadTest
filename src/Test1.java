/**
 * Created by Lenovo on 2018/4/4.
 */
public class Test1 {
    public static void main(String[] args) {

        Runner1 r=new Runner1();
//        r.run();
        r.start();
//        Thread t=new Thread(r);
//        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread:-----"+i);
        }


    }
}

//class Runner1 implements Runnable{
class Runner1 extends Thread{
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("runner1 thread: "+j);
        }
    }
}