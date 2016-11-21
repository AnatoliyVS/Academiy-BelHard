package practicaltasks.task014;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import practicaltasks.task014.comparator.ComparableToAge;
import practicaltasks.task014.comparator.ComparableToTotalMedals;
import practicaltasks.task014.comparator.ComparableToTotalMedalsGold;
import practicaltasks.task014.sportsman.Sportsman;

public class Main {

    private static final int MAX_SYMBOLS = 70;
    private static Sportsman[] sportsmans;
    private static TreeSet<Sportsman> treeSet;

    public static void main(String[] args) {

        String[] sportsmansName = {
            "Сергей ", "Егор ", "Вероника", "Андрей", "Виктория", "Дмитрий",
            "Алёна", "Роман", "Ольга", "Ольга", "Константин"
        };

        sportsmans = new Sportsman[sportsmansName.length];

        for (int i = 0; i < sportsmans.length; i++) {
            sportsmans[i] = new Sportsman(
                    sportsmansName[i],
                    random(25, 35),
                    random(0, 10),
                    random(0, 5));
        }

        line("Исходная таблица", MAX_SYMBOLS);
        for (Sportsman s : sportsmans) {
            System.out.println(s);
        }
        
        display("Таблица отсортирована всего медалей по возрастанию",
                new TreeSet<>(new ComparableToTotalMedals()));
        
        display("Таблица отсортирована золотой медалью по возрастанию",
                new TreeSet<>(new ComparableToTotalMedalsGold()));
        
        display("Таблица отсортирована возраст по возрастанию", 
                new TreeSet<>(new ComparableToAge()));
                

        line("Конец", MAX_SYMBOLS);
    }

    private static int random(int minValue, int maxValue) {
        java.util.Random random = new java.util.Random();
        return minValue + random.nextInt(maxValue - minValue);
    }

    private static void line(String str, int len) {

        String symbols = "";
        len = (len - str.length()) / 2;

        for (int i = 0; i < len; i++) {
            symbols += "=";
        }
        if (len % 2 == 0) {
            System.out.println(symbols + " " + str + " " + symbols + "=");
        } else {
            System.out.println(symbols + " " + str + " " + symbols);
        }
    }

    private static void display(String str, TreeSet treeSet) {
        line(str, MAX_SYMBOLS);
        treeSet.addAll(Arrays.asList(sportsmans));
        for (Iterator it = treeSet.iterator(); it.hasNext();) {
            Sportsman sportsman = (Sportsman) it.next();
            System.out.println(sportsman);
        }
    }
}
