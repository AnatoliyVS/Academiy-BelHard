package task010.modules.technique.category.video;

import task010.modules.Company;

/**
 * Класс Television (Телевизор)
 *
 * @author Anatoliy
 */
public class Television extends Video {

    private final String getString;
    private final Company nameCompany;

    public Television(Company nameCompany) {
        this.getString = "Телевизор";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %-20s %-10s", super.toString(), getString,nameCompany);
    }

}
