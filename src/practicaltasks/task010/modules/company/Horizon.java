package task010.modules.company;

import task010.modules.Company;

/**
 * Класс Horizon
 *
 * @author Anatoliy
 */
public class Horizon implements Company{

    private final String string;
    private final float price;

    public Horizon() {
        string = "Horizon";
        price = 0.0F;
    }

    public Horizon(float price) {
        string = "Horizon";
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2fр.", string, price);
    }
}
