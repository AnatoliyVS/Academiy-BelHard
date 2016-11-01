package practicaltasks.task004.swapping;

/**
 * Класс Swapping позволяет примитивные типы поменять местами
 *
 * @author Стесик Анатолий
 */
public class Swapping {

    public int x;
    public int y;
    private int z;

    public Swapping(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swap(Swapping value) {

        z = value.x ^ value.y;
        value.x ^= z;
        value.y ^= z;
//        z = x ^ y;
//        x ^= z;
//        y ^= z;

    }

}
