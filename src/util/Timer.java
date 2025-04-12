package util;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getElapsedTimeInMillis() {
        return (endTime - startTime) / 1_000_000;
    }

    public long getElapsedTimeInNano() {
        return (endTime - startTime);
    }

    public void printElapsed(String label) {
        System.out.println(label + ": " + getElapsedTimeInMillis() + " ms");
    }
}
