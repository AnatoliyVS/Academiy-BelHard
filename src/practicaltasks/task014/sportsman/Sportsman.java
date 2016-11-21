package practicaltasks.task014.sportsman;

import practicaltasks.task014.dataman.DataMan;

public class Sportsman extends DataMan {

    private int totalMdals;
    private int totalMedalsGold;

    public Sportsman() {
        super(null, 0);
        this.totalMdals = 0;
        this.totalMedalsGold = 0;
    }

    public Sportsman(String name, int age, int totalMdals, int totalMedalsGold) {
        super(name, age);
        this.totalMdals = totalMdals;
        this.totalMedalsGold = totalMedalsGold;
    }

    @Override
    public String toString() {
        return String.format("%s | %14d | %14d |",
                super.toString(),
                this.totalMdals,
                this.totalMedalsGold
        );
    }

    public int getTotalMdals() {
        return totalMdals;
    }

    public void setTotalMdals(int totalMdals) {
        this.totalMdals = totalMdals;
    }

    public int getTotalMedalsGold() {
        return totalMedalsGold;
    }

    public void setTotalMedalsGold(int totalMedalsGold) {
        this.totalMedalsGold = totalMedalsGold;
    }

}
