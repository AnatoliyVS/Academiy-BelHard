package practicaltasks.task016.modules;

/**
 * Класс CompanyApple (Компания Apple)
 *
 * @author Anatoliy
 */
public class CompanyApple extends Man implements IDriver {

    private final String STR_NAME_COMPANY;

    public CompanyApple() {
        STR_NAME_COMPANY = "Компания Apple";
    }

    @Override
    public String driver() {
        return "Водитель";
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("%s %s", STR_NAME_COMPANY, driver());
    }

}
