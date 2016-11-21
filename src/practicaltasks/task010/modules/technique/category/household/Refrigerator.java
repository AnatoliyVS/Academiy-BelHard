package task010.modules.technique.category.household;

import task010.modules.Company;

/**
 *
 * @author Anatoliy
 */
public class Refrigerator extends Household {

    private final String getString;
    private final Company nameCompany;

    public Refrigerator(Company nameCompany) {
        this.getString = "Холодильник";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format("%s %-20s %-10s",
                super.toString(), getString, nameCompany);
    }
}
