package practicaltasks.task007.patterns.singleton.eagerinit;

import practicaltasks.task007.idispay.IDispay;

/**
 * Класс EagerInitSingleton, В ранней реализации, экземпляр класса Singleton
 * инициализируется одновременно с загрузкой класса.
 *
 * @author Стесик Анатолий
 */
public class EagerInitSingleton implements IDispay {

    private static int count;

    private static final EagerInitSingleton INSTANCE_EAGER_INIT_SINGLETON
            = new EagerInitSingleton();

    private EagerInitSingleton() {
        System.out.println(getNameClass() + " в конструкторе.");
    }

    /**
     * Получить экземпляр класса.
     *
     * @return экземпляра класса
     */
    public static EagerInitSingleton getInstance() {
        return INSTANCE_EAGER_INIT_SINGLETON;
    }

    private String getNameClass() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void disply() {
        count++;
        System.out.println(TAB + count + " " + STR);
    }

}
