package practicaltasks.task008.service;

import java.util.Arrays;

/**
 * Класс Service
 *
 * @author Стесик Анатолий
 */
public final class Service {

    /**
     * Закрытый констант SERVICE.
     */
    private final Service[] SERVICE;

    /**
     * Конструктор с инициализацией без параметров.
     */
    public Service() {
        SERVICE = new Service[0];
    }

    /**
     * Конструктор с параметрами.
     *
     * @param services массив типа Service.
     */
    public Service(Service[] services) {
        this.SERVICE = services;
    }

    /**
     * Получает массив объектов типа Service.
     *
     * @return массив типа Service.
     */
    public Service[] getService() {
        return SERVICE;
    }

    /**
     * Преобразует массив объектов типа String в строку.
     *
     * @return строка
     */
    @Override
    public String toString() {
        return Arrays.toString(SERVICE);
    }
    
}
