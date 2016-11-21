package task010.modules.company;

import task010.modules.Company;

/**
 * Класс Apple
 *
 * @author Anatoliy
 */
public class Apple implements Company {

    private final String string;
    private final float price;

    public Apple() {
        string = "Apple";
        price = 0.0F;
    }

    public Apple(float price) {
        string = "Apple";
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2fр.", string, price);
    }
}
