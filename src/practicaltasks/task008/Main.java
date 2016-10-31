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
    private static Service[] services1;
    private static Service[] services2;

    public static void main(String[] args) {

        services1 = new Service[SIZE];

        for (int i = 0; i < services1.length; i++) {
            services1[i] = new Service();
        }

        for (Service service : services1) {
            System.out.print(Arrays.toString(service.getServices()));
        }

        System.out.println();

        for (int i = SIZE; i >= 0; i--) {
            services2[i] = new Service(services1);
        }

        for (Service services21 : services2) {
            System.out.println(Arrays.toString(services21.getServices()));
        }

        System.out.println();
    }

}
