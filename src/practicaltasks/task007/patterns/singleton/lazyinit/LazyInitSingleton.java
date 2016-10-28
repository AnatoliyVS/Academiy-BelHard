package practicaltasks.task007.patterns.singleton.lazyinit;

/**
 * Шаблон проектирования Singleton.
 *
 * Класс LazyInitSingleton, Singleton с ленивой инициализацией
 *
 * Ленивая инициализация — способ реализации шаблона Singleton с глобальной
 * методом доступа к экземпляру класса.
 *
 * @author Стесик Анатолий
 */
public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstanse() {

        return (instance == null)
                ? instance = new LazyInitSingleton()
                : instance;
    }

    @Override
    public String toString() {
        return LazyInitSingleton.class.getSimpleName();
    }

}
