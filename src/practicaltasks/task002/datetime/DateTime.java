package practicaltasks.task002.datetime;

/**
 * Класс DateTime помогающий работать с датами и времени.
 *
 * @author Стесик Анатолий
 */
public class DateTime {

    private long milliseconds;

    public DateTime(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public String getDate() {
        return "0";
    }

    public String getTime() {
        return hours() + ":" + minutes() + ":" + seconds();
    }

    public void setDate(long milliseconds) {
        this.milliseconds = milliseconds;
    }

//==============================================================================
    private int miniseconds() {
        return (int) milliseconds;
    }

    private int seconds() {
        return (int) (milliseconds % 10000 % 60000);
    }

    private int minutes() {
        return (int) (milliseconds % 10000 / 100 % 60);
    }

    private int hours() {
        return (int) (milliseconds / (60 * 60 * 1000));
    }

    private int day() {
        return 0;
    }

    private int month() {
        return 0;
    }

    private int year() {
        return 0;
    }
//==============================================================================
}
