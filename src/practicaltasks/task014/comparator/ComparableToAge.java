package practicaltasks.task014.comparator;

import java.util.Comparator;
import practicaltasks.task014.sportsman.Sportsman;

public class ComparableToAge implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return o1.getAge() < o2.getAge() ? 1 : -1;
    }

}
