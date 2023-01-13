package thread.test;

public class ThreadConceptwithRunnableInterface {
    public static void main(String[] args) {

        /* by using runnable Interface with lemada expression */
        Runnable runnableWithLemada = () -> {
            System.out.println("Thread with Runnable with Lemada......");
        };
        Thread t1 = new Thread(runnableWithLemada);
        t1.start();

        MyRunnable runnableWithoutLemada= new MyRunnable();

        Thread t2 = new Thread(runnableWithoutLemada);
        t2.start();
    }

}

class MyRunnable implements Runnable {
    @Override
    public  void run(){
        System.out.println("Thread with Runnable without Lemada......");

    }

}


