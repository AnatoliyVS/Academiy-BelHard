package practicaltasks.task007.patterns.singleton.eagerinit;

/**
 * Класс EagerInitSingleton, В ранней реализации, экземпляр класса Singleton
 * инициализируется одновременно с загрузкой класса.
 *
 * @author Стесик Анатолий
 */
public class EagerInitSingleton {

    private static final EagerInitSingleton INSTANCE_EAGER_INIT_SINGLETON
            = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    /**
     * Получить экземпляр класса.
     *
     * @return экземпляра класса
     */
    public static EagerInitSingleton getInstance() {
        return INSTANCE_EAGER_INIT_SINGLETON;
    }

    @Override
    public String toString() {
        return EagerInitSingleton.class.getSimpleName();
    }
}
