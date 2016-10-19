package practicaltasks.task001.nod;

/**
 * Класс NOD Наибольший общий делитель
 *
 * @author Стесик Анатолий
 */
public class NOD {

    private final int inputNumber1;
    private final int inputNumber2;
    private int value;

    public NOD(int inputNumber1, int inputNumber2) {
        this.inputNumber1 = inputNumber1;
        this.inputNumber2 = inputNumber2;
    }

    public int getValue() {

        int minNumber = (inputNumber1 > inputNumber2) ? inputNumber2 : inputNumber1;

        for (int i = 1; i <= minNumber; i++) {
            if (inputNumber1 % i == 0 && inputNumber2 % i == 0) {
                if (i > value) {
                    value = i;
                }
            }
        }

        return value;
    }

}
