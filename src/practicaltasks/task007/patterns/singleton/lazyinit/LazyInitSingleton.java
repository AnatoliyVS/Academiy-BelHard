package practicaltasks.task007.patterns.singleton.lazyinit;

import practicaltasks.task007.idispay.IDispay;

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
public class LazyInitSingleton implements IDispay {

    private static LazyInitSingleton instance;
    private static int count;

    private LazyInitSingleton() {
        System.out.println(this.getNameClass() + " в конструкторе.");
    }

    public static LazyInitSingleton getInstanse() {

        return (instance == null)
                ? instance = new LazyInitSingleton()
                : instance;
    }

    private String getNameClass() {
        return LazyInitSingleton.class.getSimpleName();
    }

    @Override
    public void disply() {
        count++;
        System.out.println(TAB + count + " " + STR);
    }

}
