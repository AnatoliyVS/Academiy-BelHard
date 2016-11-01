package practicaltasks.task004;

import java.util.Scanner;
import practicaltasks.task004.swapping.Swapping;

/**
 * есть 2 int переменные (значения от 0 до 9999), поменять их значения местами с
 * помощью доп. переменной, сдвига, операции xor
 *
 * @author Стесик Анатолий
 */
public class Main {

    private static int count;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 9999;
    private static int x;
    private static int y;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            x = scanner.nextInt();
            System.out.print("Введите второе число: ");
            y = scanner.nextInt();

            if (x < MIN_VALUE || y < MIN_VALUE || x > MAX_VALUE || y > MAX_VALUE) {
                count++;
                System.err.println(
                        "Первое и второе число не должно быть меньше 0 и не больше 9999"
                );
                System.out.println(count + " " + "Повторите пожалуста.");
            } else {
                break;
            }
        } while (true);

        Swapping s = new Swapping(x, y);

        System.out.println("1 : " + "a = " + x + "\t" + "b = " + y);

        s.swap(s);

        x = s.x;
        y = s.y;

        System.out.println("2 : " + "a = " + x + "\t" + "b = " + y);
    }

}
