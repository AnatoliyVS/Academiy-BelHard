package practicaltasks.task013.modules;

/**
 *
 * @author Anatoliy
 */
public class TimeProgramm {

    public static class Millis {

        public long start() {
            return System.currentTimeMillis();
        }

        public long finish() {
            return System.currentTimeMillis();
        }

        public long result(long start, long finish) {
            return finish - start;
        }

        public void display(long result) {
            System.out.println(result);
        }

    }

    public static class Nano {

        public long start() {
            return System.nanoTime();
        }

        public long finish() {
            return System.nanoTime();
        }

        public long result(long start, long finish) {
            return finish - start;
        }

        public void display(long result) {
            System.out.println(result);
        }
    }
}
