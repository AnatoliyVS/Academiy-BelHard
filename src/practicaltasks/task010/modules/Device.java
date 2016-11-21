package task010.modules;

/**
 * Класс "Device" (Прибор)
 *
 * @author Anatoliy
 */
public abstract class Device {

    private final String getString = "Прибор: ";

    public String getString() {
        return String.format("%-8s", getString);
    }
//public abstract String get
}
