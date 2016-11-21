package practicaltasks.task013;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import practicaltasks.task013.modules.TimeProgramm;

/**
 *
 * @author Anatoliy
 */
public class Main {

    private static final int INCREMENT = 100_000;
    private static final int MIN_VALUE = 999;
    private static final int MAX_VALUE = 999999;

    public static void main(String[] args) {
//==============================================================================
        int speedList1 = testArraydList(new ArrayList(), MAX_VALUE, MIN_VALUE, MAX_VALUE);
        System.out.println("время = " + speedList1);
        System.out.println();
        int speedList2 = testLinkedList(new LinkedList(), INCREMENT, MIN_VALUE, MAX_VALUE);
        System.out.println("время = " + speedList2);
        System.out.println();
        int speedSet1 = testSet(new HashSet(), INCREMENT, MIN_VALUE, MAX_VALUE);
        System.out.println("время = " + speedSet1);
        System.out.println();

        displayTestResult(speedList1, speedList2, speedSet1);
//==============================================================================
    }

    private static int testArraydList(ArrayList al, int increment, int minValue, int maxValue) {

        TimeProgramm.Millis tMillis = new TimeProgramm.Millis();
        long startMillis = tMillis.start();
        System.out.println("Начала : " + al.getClass().getName());

        System.out.println("1" + " : ok");

        for (int i = 0; i < increment; i++) {
            al.add(random(minValue, maxValue));
        }
        System.out.println("2" + " : ok");

        for (int i = 0; i < increment; i++) {
            al.set(i, random(minValue, maxValue));
        }
        System.out.println("3" + " : ok");

        for (int i = increment - 1; i >= 0; i--) {
            al.remove(i);
        }
        System.out.println("4" + " : ok");

        al.clear();
        System.out.println("Конец : " + al.getClass().getName());
        long finishMillis = tMillis.finish();
        return (int) tMillis.result(startMillis, finishMillis);
    }

    private static int testLinkedList(LinkedList ll, int increment, int minValue, int maxValue) {

        TimeProgramm.Millis tMillis = new TimeProgramm.Millis();
        long startMillis = tMillis.start();
        System.out.println("Начала : " + ll.getClass().getName());

        System.out.println("1" + " : ok");

        for (int i = 0; i < increment; i++) {
            ll.add(random(minValue, maxValue));
        }
        System.out.println("2" + " : ok");

        for (int i = 0; i < increment; i++) {
//            System.out.println(i);
            ll.set(i, random(minValue, maxValue));
        }
        System.out.println("3" + " : ok");

        for (int i = increment - 1; i >= 0; i--) {
            ll.remove(i);
        }
        System.out.println("4" + " : ok");

        ll.clear();
        System.out.println("Конец : " + ll.getClass().getName());
        long finishMillis = tMillis.finish();
        return (int) tMillis.result(startMillis, finishMillis);
    }

    private static int testSet(HashSet hashSet, int increment, int minValue, int maxValue) {

        TimeProgramm.Millis tMillis = new TimeProgramm.Millis();
        long startMillis = tMillis.start();
        System.out.println("Начала : " + hashSet.getClass().getName());

        System.out.println("1" + " : ok");

        for (int i = 0; i < increment; i++) {
            hashSet.add(random(minValue, maxValue));
        }
        System.out.println("2" + " : ok");

        HashSet copy = new HashSet(hashSet);
        for (Object hs : copy) {
            hashSet.remove(hs);
        }
        System.out.println("3" + " : ok");

        for (int i = 0; i < increment; i++) {
            hashSet.add(random(minValue, maxValue));
        }
        System.out.println("4" + " : ok");

        copy = new HashSet(hashSet);
        for (Object hs : copy) {
            hashSet.remove(hs);
        }
        System.out.println("5" + " : ok");

        hashSet.clear();
        System.out.println("Конец : " + hashSet.getClass().getName());
        long finishMillis = tMillis.finish();
        return (int) tMillis.result(startMillis, finishMillis);
    }

    private static int random(int minValue, int maxValue) {
        java.util.Random random = new java.util.Random();
        return minValue + random.nextInt(maxValue - minValue);
    }

    private static void displayTestResult(int speedList1, int speedList2, int speedSet1) {
        int max = maxValue(speedList1, speedList2, speedSet1);
        int average = averageValue(speedList1, speedList2, speedSet1);
        int min = minValue(speedList1, speedList2, speedSet1);

        System.out.println(min + " " + average + " " + max);
    }

    private static int maxValue(int... value) {

        int max = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        return max;
    }

    private static int minValue(int... value) {

        int min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] < min) {
                min = value[i];
            }
        }
        return min;
    }

    private static int averageValue(int speedList1, int speedList2, int speedSet1) {

        return speedList1 + speedList2 + speedSet1
                - minValue(speedList1, speedList2, speedSet1)
                - maxValue(speedList1, speedList2, speedSet1);
    }
}
