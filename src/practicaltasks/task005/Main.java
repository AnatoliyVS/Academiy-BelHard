package practicaltasks.task005;

import java.util.Scanner;

/**
 * написать метод, который разделит одно число на другое не используя оператор
 * деления. предусмотреть все возможные ошибки
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

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int number1 = input.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int number2 = input.nextInt();
        int number1 = 9;
        int number2 = 3;

        int value = divide(number1, number2);

        System.out.println("divide = " + value);
    }

    private static int divide(int number1, int number2) {
        
        int value = number1 * number2;
        
        int i = 0;
        
        for (; i != number1; i++) {
            number1 = value-number1;
        }
        return i;
        // return Math.floorDiv(number1, number2);
    }

}
