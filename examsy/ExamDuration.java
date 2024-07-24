package examsy;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExamDuration {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void startTimer(int minutes) {
        scheduler.schedule(() -> {
            System.out.println("Time is up! Submitting your answers...");
            // Simulate auto submit functionality
            // ExamManager.submitExam(username);
        }, minutes, TimeUnit.MINUTES);
    }

    public static void stopTimer() {
        scheduler.shutdownNow();
    }
}
