package practicaltasks.task001.nok;

/**
 * Класс NOK Наименьшее общее кратное
 *
 * @author Стесик Анатолий
 */
public class NOK {

    int inputNumber1;
    int inputNumber2;
    private int value;

    public NOK(int inputNumber1, int inputNumber2) {
        this.inputNumber1 = inputNumber1;
        this.inputNumber2 = inputNumber2;
    }

    public int getValue() {

        for (int i = 1; value == 0; i++) {
            if (i % inputNumber1 == 0 && i % inputNumber2 == 0) {
                value = i;
            }
        }

        return value;
    }
}
