package task010.modules.company;

import task010.modules.Company;

/**
 * Класс Atlant
 *
 * @author Anatoliy
 */
public class Atlant implements Company {

    private final String string;
    private final float price;

    public Atlant() {
        string = "Atlant";
        price = 0.0F;
    }

    public Atlant(float price) {
        string = "Atlant";
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2fр.", string, price);
    }
}
