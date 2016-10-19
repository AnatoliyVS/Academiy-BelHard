package practicaltasks.task002;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import practicaltasks.task002.datetime.DateTime;

/**
 * Сделать класс, помогающий работать с датами. В классе должно быть свойство
 * date (long) и сеттер к нему. В date хранится количество миллисекунд. В классе
 * должны быть методы: getDate() - который вернет дату в виде "7 апрель 1987" по
 * количеству миллисекунд, прошедших с 1 января 1970 года 00:00 а также метод
 * getTime() который вернет текущее время ("07:24").
 *
 * @author Стесик Анатолий
 */
public class Main {

    public static void main(String[] args) {

//==============================================================================
        Date date = new Date();
        DateTime dateTime = new DateTime(date.getTime());
        System.out.println(dateTime.getDate());
        System.out.println("Time: " + date.getTime());
//==============================================================================
//        DateTime dateTime = new DateTime(System.currentTimeMillis());
//        System.out.println(dateTime.getDate());
//        Locale local = new Locale("ru", "RU");
//==============================================================================
//
//==============================================================================
//        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, local);
//        Date date = new Date();
//        System.out.println("Date: " + df1.format(date));
//
//        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.DEFAULT, local);
//        date = new Date();
//        System.out.println("Time: " + df2.format(date));
//==============================================================================
    }

}
