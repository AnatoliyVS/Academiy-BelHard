package practicaltasks.task002.datetime;

/**
 * Класс DateTime помогающий работать с датами и времени.
 *
 * @author Стесик Анатолий
 */
public class DateTime {

    private long milliseconds;

    private static final int SECOND = 1000;
    private static final int MINUTE = 60 * SECOND;
    private static final int HOUR = 60 * MINUTE;
    private static final int DAY = 24 * HOUR;
    
//==============================================================================
        /**
         * Number of milliseconds in a standard second.
         */
        private final long MILLIS_PER_SECOND = 1000;
        /**
         * Number of milliseconds in a standard minute.
         */
        private final long MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
        /**
         * Number of milliseconds in a standard hour.
         */
        private final long MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
        /**
         * Number of milliseconds in a standard day.
         */
        private final long MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;
//==============================================================================

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
    private long miniseconds() {
        return milliseconds;
    }

    private int seconds() {
        return (int) (milliseconds % 60);
    }

    private int minutes() {
        return (int) (milliseconds % MILLIS_PER_MINUTE);
    }

    private int hours() {
        return (int) (milliseconds / 24 % 60 % 60);
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
