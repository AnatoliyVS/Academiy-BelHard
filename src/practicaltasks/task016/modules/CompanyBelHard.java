package practicaltasks.task016.modules;

/**
 * Класс CompanyBelHard (Компания BelHard)
 *
 * @author Anatoliy
 */
public class CompanyBelHard extends Man implements IWorker {

    private final String STR_NAME_COMPANY;
    private String str;

    public CompanyBelHard() {
        STR_NAME_COMPANY = "Компания BelHard";
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String worker() {
        return "Работник";
    }

    @Override
    public String toString() {
        return String.format("%s %s", STR_NAME_COMPANY, worker());
    }

}
