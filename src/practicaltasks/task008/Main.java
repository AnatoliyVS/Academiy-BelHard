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
    private static Service[] services;
    private static Service[] services1;

    public static void main(String[] args) {

        services = new Service[SIZE];

        for (int i = 0; i < services.length; i++) {
            services[i] = new Service();
        }

        for (Service service : services) {
            System.out.print(Arrays.toString(service.services));
        }

        System.out.println();

        services1[SIZE] = new Service(services);

        for (int i = 0; i < services1.length; i++) {
            services1[i] = new Service(services);
        }

        for (Service services11 : services1) {
            System.out.print(services11.toString());
        }

        System.out.println();
    }

}
