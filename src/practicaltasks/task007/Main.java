package practicaltasks.task007;

import practicaltasks.task007.patterns.singleton.eagerinit.EagerInitSingleton;
import practicaltasks.task007.patterns.singleton.enumsingleton.EnumSingleton;
import practicaltasks.task007.patterns.singleton.lazyinit.LazyInitSingleton;

/**
 *
 * @author Стесик Анатолий
 */
public class Main {

    public static void main(String[] args) {

        // 
        LazyInitSingleton.getInstanse().disply();
        LazyInitSingleton.getInstanse().disply();
        LazyInitSingleton.getInstanse().disply();
        
        System.out.println();
        
        EagerInitSingleton.getInstance().disply();
        EagerInitSingleton.getInstance().disply();
        EagerInitSingleton.getInstance().disply();
        
        System.out.println();
        
        EnumSingleton.INSTANCE.disply();
        EnumSingleton.INSTANCE.disply();
        EnumSingleton.INSTANCE.disply();
        
        System.out.println();
    }

}
