package practicaltasks.task001;

import practicaltasks.task001.nok.NOK;
import practicaltasks.task001.nod.NOD;
import java.util.Scanner;

/**
 * Найти наименьшее общее кратное и наибольший общий делитель числа, вводимого с
 * консоли.
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

        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();

        NOD nod = new NOD(number1, number2);
        NOK nok = new NOK(number1, number2);

        System.out.println("NOD(" + number1 + "," + number2 + ") = " + nod.getValue());
        System.out.println("NOK(" + number1 + "," + number2 + ") = " + nok.getValue());
    }

}
