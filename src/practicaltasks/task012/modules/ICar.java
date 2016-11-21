package practicaltasks.task012.modules;

/**
 * Интерфейс "Машина"
 *
 * @author Anatoliy
 */
public interface ICar {

    public String STR_CAR = "Машина: ";

    /**
     * Разблокировать двери
     */
    public void unlockDoors();

    /**
     * Заблокировать двери
     */
    public void lockDoors();

    /**
     * Включить машину
     */
    public void onCar();

    /**
     * Выключить машину
     */
    public void offCar();

    /**
     * Увеличить скорость
     */
    public void increaseSpeed();

    /**
     * Уменьшить скорость
     */
    public void reduceSpeed();

    /**
     * Переключить передачу
     */
    public void changeGear();

    /**
     * Заправить машину
     */
    public void fillCar();
}
