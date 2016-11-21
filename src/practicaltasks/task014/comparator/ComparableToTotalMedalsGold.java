package practicaltasks.task014.comparator;

import java.util.Comparator;
import practicaltasks.task014.sportsman.Sportsman;

public class ComparableToTotalMedalsGold implements Comparator<Sportsman>{

    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        return o1.getTotalMedalsGold()< o2.getTotalMedalsGold()? 1 : -1;
    }
    
}
