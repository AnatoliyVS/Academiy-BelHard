package task010.modules.technique.category.household;

import task010.modules.Company;

/**
 * Класс WashingMachine (Стиральная машина)
 *
 * @author Anatoliy
 */
public class WashingMachine extends Household {

    private final String getString;
    private final Company nameCompany;

    public WashingMachine(Company nameCompany) {
        this.getString = "Стиральная машина";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format("%s %-20s %-10s",
                super.toString(), getString, nameCompany);
    }
}
