package practicaltasks.task004.option_2.swapping;

/**
 * Класс Swapping позволяет примитивные типы поменять местами
 *
 * @author Стесик Анатолий
 */
public class Swap {

    private int x;
    private int y;
    private int z;

    public void swap(int a, int b) {

        x = a;
        y = b;

        z = x ^ y;
        x ^= z;
        y ^= z;

        a = x;
        b = y;
    }
}
