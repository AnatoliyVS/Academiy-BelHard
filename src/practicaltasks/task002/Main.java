package practicaltasks.task002;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
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

    private static boolean flag;

    public static void main(String[] args) {

        do {
            {//-----------------------------------------------------------------
                ProgramIsRunning();
            }//-----------------------------------------------------------------

            do {
                switch (menu()) {
                    case "1":
                        flag = true;
                        break;
                    case "2": {
                        System.exit(0);
                    }
                    default: {
                        System.err.println(
                                "Не правильно выбрали номер из меню, повторите пожалуйста"
                        );
                        flag = false;
                    }
                }
            } while (flag == false);

        } while (true);

    }

    private static String menu() {

        System.out.println();

        System.out.println(
                "Меню:" + "\n"
                + "1 - повторит" + "\n"
                + "2 - выход"
        );

        System.out.print("> ");

        Scanner inputMenu = new Scanner(System.in);

        switch (inputMenu.nextLine()) {
            case "1":
                return "1";
            case "2":
                return "2";
        }
        return "0";
    }

    private static void ProgramIsRunning() {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите время в миллисекундах прошедшее с момента 1 января 1970 года 00:00: ");
        long inputMilliseconds = input.nextInt();

//==============================================================================
//        Date date = new Date();
//        DateTime dateTime = new DateTime(date.getTime());
//        System.out.println(dateTime.getDate());
//        System.out.println("Time: " + date.getTime());
//==============================================================================
//        DateTime dateTime = new DateTime(System.currentTimeMillis());
//        System.out.println(dateTime.getDate());
//==============================================================================
//
//==============================================================================
//        Locale local = new Locale("ru", "RU");
//
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
