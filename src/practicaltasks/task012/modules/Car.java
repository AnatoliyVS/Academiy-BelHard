package practicaltasks.task012.modules;

/**
 * Класс "Машина"
 *
 * @author Anatoliy
 */
public class Car implements ICar {

    public Car() {
    }

    @Override
    public void unlockDoors() {
        System.out.println(STR_CAR + "дверь разблокирована.");

    }

    @Override
    public void lockDoors() {
        System.out.println(STR_CAR + "дверь заблокирована.");
    }

    @Override
    public void onCar() {
        System.out.println(STR_CAR + "завела.");
    }

    @Override
    public void offCar() {
        System.out.println(STR_CAR + "заглохла.");
    }

    @Override
    public void increaseSpeed() {
        System.out.println(STR_CAR + "увеличивала скорость.");
    }

    @Override
    public void reduceSpeed() {
        System.out.println(STR_CAR + "уменьшила скорость.");
    }

    @Override
    public void changeGear() {
        System.out.println(STR_CAR + "переключила передачу");
    }

    @Override
    public void fillCar() {
        System.out.println(STR_CAR + "нажрался бензина.");
    }

}
