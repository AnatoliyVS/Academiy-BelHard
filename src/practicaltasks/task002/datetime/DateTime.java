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
//    private int miniseconds() {
//        return (int) (milliseconds % 1000);
//    }
    private int seconds() {
        return (int) (milliseconds % 60);
    }

    private int minutes() {
        return (int) (milliseconds / 60 % 60);
    }

    private int hours() {
        return (int) (milliseconds / 24 % (60 % 60));
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
