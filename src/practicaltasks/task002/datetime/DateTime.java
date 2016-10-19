package practicaltasks.task002.datetime;

/**
 * Класс DateTime помогающий работать с датами и времени.
 *
 * @author Стесик Анатолий
 */
public class DateTime {

    private long date;
    private int buff;

    public DateTime(long milliseconds) {
        this.date = milliseconds;
    }

    public String getDate() {
        return String.format(
                "miniseconds: " + miniseconds() + "\n"
                + "seconds: " + seconds() + "\n"
                + "minutes: " + minutes()
        );
    }

    public void setDate(long milliseconds) {
        this.date = milliseconds;
    }

    private int getDay() {
        return 0;
    }

    private int getMonth() {
        return 0;
    }

    private int getYear() {
        return 0;
    }

    private long hours() {
        return 0;
    }

    private long minutes() {
        return (date % 10_000_000) / 60_000;
    }

    private long seconds() {
        return (date % 100_000) % 60_000 / 1_000;
    }

    private long miniseconds() {
        return date % 1_000;
    }
}
