package task010.modules.technique.category.audio;

import task010.modules.Device;

/**
 * Класс Audio (Аудио техника)
 *
 * @author Anatoliy
 */
public class Audio extends Device {

    private final String getString;

    public Audio() {
        getString = "Аудиотехника";
    }

    @Override
    public String toString() {
        return String.format("%s %-20s", super.getString(), getString);
    }
}
