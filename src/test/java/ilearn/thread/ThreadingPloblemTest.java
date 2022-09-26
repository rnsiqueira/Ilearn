package ilearn.thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.fail;

public class ThreadingPloblemTest {

    @Test(expected = AssertionError.class)
    public void TwothreadsShouldFailEventually() throws InterruptedException {
        final WithThreadingProblem withThreadingProblem = new WithThreadingProblem();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                withThreadingProblem.takeNextId();
            }
        };

        for (int i = 0; i < 50000; i++) {
            int lastId = withThreadingProblem.nextId;
            int expectedresult = 2 + lastId;
            Thread thread1 = new Thread(runnable);
            Thread thread2 = new Thread(runnable);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            int endingId = withThreadingProblem.nextId;
            if (endingId != expectedresult)
                return;

        }

        fail("Should have exposed a threading issue but it did not.");


    }

    @Test
    public void threndingProblemWithExecutions() {
        final WithThreadingProblem withThreadingProblem = new WithThreadingProblem();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                withThreadingProblem.takeNextId();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(50000);
        int startId = withThreadingProblem.nextId;
        int expectativeId = 2 + startId;
        executorService.submit(runnable);
        int endId = withThreadingProblem.nextId;
        if (expectativeId != endId)
            return;

        fail("Error Theads executors!!");

    }
}
