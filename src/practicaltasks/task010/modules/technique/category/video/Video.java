package task010.modules.technique.category.video;

import task010.modules.Device;

/**
 * Класс Video (Видео техника)
 *
 * @author Anatoliy
 */
public class Video extends Device {

    private final String getString;

    public Video() {
        getString = "Видеотехника";
    }

    @Override
    public String toString() {
        return String.format("%s %-20s", super.getString(), getString);
    }

}
