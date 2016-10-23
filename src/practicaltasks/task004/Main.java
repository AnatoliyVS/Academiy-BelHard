package practicaltasks.task004;

/**
 * есть 2 int переменные (значения от 0 до 9999), поменять их значения местами с
 * помощью доп. переменной, сдвига, операции xor
 *
 * @author Стесик Анатолий
 */
public class Main {

    public static void main(String[] args) {

        int a = 123;
        int b = 321;

        System.out.println("a = " + a + "\t" + "b = " + b);
//+----------------------------------------------------------------------------+
//| пример 1: с помощью доп. переменной                                        |
//+----------------------------------------------------------------------------+        
//        int c;
//        c = a ^ b;
//        b = c ^ b;
//        a = c ^ b;
//+----------------------------------------------------------------------------+
        swap(a, b);

//        System.out.println("a = " + a + "\t" + "b = " + b);
    }

    private static void swap(int a, int b) {
        int c = a ^ b;
        b = c ^ b;
        a = c ^ b;
        System.out.println("a = " + a + "\t" + "b = " + b);
//        System.out.println("ok");
    }
}
