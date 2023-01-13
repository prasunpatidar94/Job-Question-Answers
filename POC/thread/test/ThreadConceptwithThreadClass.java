package thread.test;




class MyThreadClass extends Thread {
    @Override
    public  void run(){
        System.out.println("Thread with Thread Class .....");

    }

}

public class ThreadConceptwithThreadClass {
    public static void main(String[] args) {

        Thread t= new MyThreadClass();
        t.start();
    }

}

