package practicaltasks.task012;

import practicaltasks.task012.modules.Car;
import practicaltasks.task012.modules.ICar;

/**
 * сделать интерфейс машины, у которой есть публичные методы - разблокировать
 * двери, завестись\выключиться, увеличить скорость, уменьшить скорость,
 * переключить передачу, заправить машиную сделать класс машины, который
 * имплементит интерфейс. Машина должна заводиться только после того, как ее
 * сняли с сигнализации. Машина поедет только если есть топливо машина поедет
 * только если включена передача. При нажатии на газ - увеличивается скорость
 * машины, на тормоз - уменьшается. Расход топлива. Если закончилось -
 * останавливается, выключается. реализовать через внутренние классы двигателя,
 * бензобака, коробки передач и т.д. для этих классов в интерфейсе машины должны
 * быть свои интерфейсы программа должна продемонстрировать как машина едет -
 * т.е. на консоль если машина работает после любого действия должна выводиться
 * ее скорость и номер передачи
 *
 * @author Anatoliy
 */
/**
 * Класс "Main"
 *
 * @author StudentTC
 */
public class Main {

    public static void main(String[] args) {
        
        ICar ic = new Car();
        
        ic.unlockDoors();
        ic.offCar();
        ic.increaseSpeed();
        ic.reduceSpeed();
        ic.fillCar();
        ic.changeGear();
        ic.increaseSpeed();
        ic.reduceSpeed();
        ic.offCar();
        ic.lockDoors();
    }

}
