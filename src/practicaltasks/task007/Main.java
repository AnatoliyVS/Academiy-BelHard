package practicaltasks.task007;

import practicaltasks.task007.patterns.singleton.eagerinit.EagerInitSingleton;
import practicaltasks.task007.patterns.singleton.lazyinit.LazyInitSingleton;

/**
 *
 * @author Anatoliy
 */
public class Main {

    public static void main(String[] args) {

        LazyInitSingleton lazyInitSingleton = LazyInitSingleton.getInstanse();
        System.out.println(lazyInitSingleton.toString());

        EagerInitSingleton eagerInitSingleton = EagerInitSingleton.getInstance();
        System.out.println(eagerInitSingleton.toString());

    }

}
