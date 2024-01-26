package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTests {


        public static void main(String[] args) {

                Thread t1=new Thread(()->{
                        System.out.println("running in thread2"+Thread.currentThread().getName());
                        for(int i=0;i<1000;i+=2){
                                System.out.println(i);
                        }
                });

                Thread t2=new Thread(()->{
                        for(int i=1;i<1000;i+=2){
                                System.out.println(i);
                        }
                });
                ExecutorService es= Executors.newSingleThreadExecutor();
                es.execute(t1);
                es.execute(t2);

              //  t1.start();
              //  t2.start();
                System.out.println("running in thread1"+Thread.currentThread().getName());

        }



}
