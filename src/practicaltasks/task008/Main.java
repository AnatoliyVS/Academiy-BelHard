package practicaltasks.task008;

import java.util.Arrays;
import practicaltasks.task008.service.Service;

/**
 * сделть неизменяемый класс Service, в котором есть поля-мяссив объектов
 * Service
 *
 * @author Стесик Анатолий
 */
public class Main {

    private static final int SIZE = 5;
    private static Service[] arrayServices;
    private static Service services;

    public static void main(String[] args) {
        
        // выделяет в памяти объект-массив
        arrayServices = new Service[SIZE];

        // объект-массив создает в каждом объекте
        for (int i = 0; i < arrayServices.length; i++) {
            arrayServices[i] = new Service();
        }

        // вывод
        for (Service service : arrayServices) {
            System.out.print(Arrays.toString(service.getService()));
        }

        System.out.println();

        // создает еще один объект с объект-массив
        services = new Service(arrayServices);

        // вывод
        System.out.println(Arrays.toString(services.getService()));

        System.out.println();
    }

}
