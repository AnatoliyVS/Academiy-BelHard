package practicaltasks.task007.patterns.singleton.enumsingleton;

import practicaltasks.task007.idispay.IDispay;

/**
 *
 * @author Стесик Анатолий
 */
public enum EnumSingleton implements IDispay {
    INSTANCE;

    private static int count;

    private EnumSingleton() {
        System.out.println(getNameClass() + " в конструкторе.");
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
