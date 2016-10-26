package practicaltasks.task004.option_2;

import practicaltasks.task004.option_2.swapping.Swap;

/**
 * есть 2 int переменные (значения от 0 до 9999), поменять их значения местами с
 * помощью доп. переменной, сдвига, операции xor
 *
 * @author Стесик Анатолий
 */
public class Main {

    public static void main(String[] args) {

        int x = 123;
        int y = 321;

        Swap s = new Swap();

        System.out.println("1 : " + "a = " + x + "\t" + "b = " + y);
        s.swap(x, y);
        int aa = x;
        int bb = y;
        System.out.println("2 : " + "a = " + aa + "\t" + "b = " + bb);
    }
    
}