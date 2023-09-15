package multithreading;

public class OrderTest {
int counter=1;
    public static void main(String[] args) throws InterruptedException {
        FooBar foobar= new FooBar(4);
        Thread foo= new Thread(
            ()->{
                    for (int i = 0; i < 4; i++) {
                        System.out.println("foo");
                    }
        });
        Thread bar= new Thread(
                ()->{
                    for(int i=0; i<4; i++){
                        System.out.println("bar");
                    }
                });
        try {
            foo.start();
            bar.start();
        }
        /*try {
            foobar.foo(foo);
            foobar.bar(bar);

        }*/
        catch(Exception e){
            e.printStackTrace();
        }
    }


}
