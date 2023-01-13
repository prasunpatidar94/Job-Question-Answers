package thread.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadConceptwithCallableAndExecutorServiceInterface {
    public static void main(String[] args) {

        List<Callable<String>> callableList= Arrays.asList(
                new ThreadTask1(),
                new ThreadTask2(),
                new ThreadTask3()
        );
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);


        try {
            List<Future<String>> futureList = threadPoolExecutor.invokeAll(callableList);
            System.out.println(threadPoolExecutor.getPoolSize());
            System.out.println(threadPoolExecutor.getThreadFactory());
            System.out.println(threadPoolExecutor.getActiveCount());
            System.out.println(threadPoolExecutor.getCorePoolSize());
            System.out.println(threadPoolExecutor.getThreadFactory());
            System.out.println(futureList);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

class ThreadTask1 implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("Thread task : 1");
        return "This is the call to Thread task : 1";
    }
}

class ThreadTask2 implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("Thread task : 2");
        return "This is the call to Thread task : 2";
    }
}

class ThreadTask3 implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("Thread task : 3");
        return "This is the call to Thread task : 4";
    }
}


