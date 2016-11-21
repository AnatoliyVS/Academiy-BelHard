package practicaltasks.task016;

import practicaltasks.task016.modules.CompanyApple;
import practicaltasks.task016.modules.CompanyBelHard;
import practicaltasks.task016.modules.Man;

/**
 * сделать абстрактный класс man и 3 интерфейса. один- worker для задания того
 * что он умеет делать на работе второй - restable для отдыха. третий driver
 * только для водителей с методом drive() сделать несколько классов наследников
 * man которые наследуют man и имплементят некоторые из интерфейсов сделать 2
 * класса компании которые принимают на работу 1.только worker, 2. только driver
 *
 * @author Anatoliy
 */
public class Main {

    public static void main(String[] args) {

        Man[] mans = {
            new CompanyApple(), 
            new CompanyBelHard()
        };

        display(mans);
    }

    private static void display(Man[] mans) {
        for (Man man : mans) {
            man.display();
        }
    }

}
