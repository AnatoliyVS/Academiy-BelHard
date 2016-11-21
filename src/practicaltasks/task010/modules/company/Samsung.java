package task010.modules.company;

import task010.modules.Company;

/**
 * Класс Samsung
 *
 * @author Anatoliy
 */
public class Samsung implements Company {

    private final String string;
    private final float price;

    public Samsung() {
        string = "Samsung";
        price = 0.0F;
    }

    public Samsung(float price) {
        string = "Samsung";
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10.2fр.", string, price);
    }
}
