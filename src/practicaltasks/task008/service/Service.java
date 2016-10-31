package practicaltasks.task008.service;

import java.util.Arrays;

/**
 *
 * @author Стесик Анатолий
 */
public final class Service {

    private Service[] services;

    public Service() {
        services = new Service[0];
    }

    public Service(Service[] services) {
        this.services = services;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return Arrays.toString(services);
    }
}
