package task010.modules.technique.category.audio;

import task010.modules.Company;

/**
 * Класс MusicCenter (Музыкальный центр)
 *
 * @author Anatoliy
 */
public class MusicCenter extends Audio {

    private final String getString;
    private final Company nameCompany;

    public MusicCenter(Company nameCompany) {
        this.getString = "Музыкальный центр";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %-20s %-10s", super.toString(), getString, nameCompany);
    }
}
