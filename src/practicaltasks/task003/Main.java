package practicaltasks.task003;

import java.util.Scanner;
import practicaltasks.task003.date.Date;

/**
 * сделать класс, который преобразует число (1987 например) в строку (одна
 * тысяча девятьсот восемьдесят седмой) и использовать этот класс как свойство
 * для класса из предыдущей задачи для использования в методе getDate()
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

        Scanner inputNumberYear = new Scanner(System.in);

        System.out.println("Введите год:");
        System.out.print("> ");

        int numberYear = inputNumberYear.nextInt();

        Date date = new Date(numberYear);

        // Преобразует число в строку
        date.convertsNumberToString();

        System.out.println(date.getDate());
    }
}
