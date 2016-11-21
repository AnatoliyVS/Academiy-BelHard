package task010.modules.technique.category.household;

import task010.modules.Device;

/**
 * Класс Household (Бытовая техника)
 *
 * @author Anatoliy
 */
public class Household extends Device {

    private final String getString;

    public Household() {
        getString = "Бытовая техника";
    }

    @Override
    public String toString() {
        return String.format("%s %-20s", super.getString(), getString);
    }
}
