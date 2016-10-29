package practicaltasks.task004.option_2.swapping;

/**
 * Класс Swapping позволяет примитивные типы поменять местами
 *
 * @author Стесик Анатолий
 */
public class Swap {

    public int x;
    public int y;
    private int z;

    public Swap(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swap(Swap value) {

        z = value.x ^ value.y;
        value.x ^= z;
        value.y ^= z;
//        z = x ^ y;
//        x ^= z;
//        y ^= z;

    }

}
