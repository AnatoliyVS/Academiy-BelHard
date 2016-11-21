package task010.modules.technique.category.audio;

import task010.modules.Company;

/**
 * Класс RecordPlayer (Магнитафон)
 *
 * @author Anatoliy
 */
public class RecordPlayer extends Audio {

    private final String getString;
    private final Company nameCompany;

    public RecordPlayer(Company nameCompany) {
        this.getString = "Магнитофон";
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return String.format("%s %-20s %-10s",
                super.toString(), getString, nameCompany);
    }
}
