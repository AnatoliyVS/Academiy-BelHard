package practicaltasks.task014.comparator;

import java.util.Comparator;
import practicaltasks.task014.sportsman.Sportsman;

public class ComparableToTotalMedals implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return o1.getTotalMdals() < o2.getTotalMdals() ? 1 : -1;
    }

}
