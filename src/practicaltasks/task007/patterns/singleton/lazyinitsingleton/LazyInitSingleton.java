package practicaltasks.task007.patterns.singleton.lazyinitsingleton;

/**
 * Шаблон проектирования Singleton.
 *
 * Класс LazyInitSingleton, Singleton с ленивой инициализацией/
 *
 * Ленивая инициализация — способ реализации шаблона Singleton с глобальной
 * методом доступа к экземпляру класса.
 *
 * @author Anatoliy
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
}
