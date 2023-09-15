package multithreading;

public class FooBarSynchronized {
    public static int count=2;
    private boolean isFoo=true;

    public static void main(String[] args) {
        FooBarSynchronized fs= new FooBarSynchronized();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                fs.printBar();

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               fs.printFoo();
            }
        });
        t1.start();t2.start();
    }
    public  void printBar(){
        while(count>0) {
            if(!isFoo)
            synchronized (this) {
                System.out.println("Bar");
                count--;
                isFoo=true;
            }
        }
    }
    public  void printFoo(){

        while(count>0) {
            if(isFoo){
            synchronized (this) {
                System.out.println("Foo");
                count--;
                isFoo=false;
            }}
        }

}
}

