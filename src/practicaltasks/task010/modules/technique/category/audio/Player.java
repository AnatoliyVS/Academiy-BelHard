package task010.modules.technique.category.audio;

import task010.modules.Company;

/**
 * Класс Player (Плейер)
 *
 * @author Anatoliy
 */
public class Player extends Audio {

    private final String getString;
    private final Company nameCompany;

    public Player(Company nameCompany) {
        this.getString = "Плейер";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format("%s %-20s %-15s", 
                super.toString(), getString, nameCompany);
    }
}
