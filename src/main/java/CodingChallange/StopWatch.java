package CodingChallange;

public class StopWatch {

    private long start;
    private long end;

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        // TODO: implement
        end = System.currentTimeMillis();

    }

    public Long getElapsedTime() {
        return end - start;
    }

    private static void timeTest(StopWatch watch, int delay) {
        watch.start();
        try {
            Thread.sleep(delay);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        watch.stop();
        System.out.println("Elapsed: " + watch.getElapsedTime());
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
//        watch.getElapsedTime();
        timeTest(watch, 2000);
    }
}
