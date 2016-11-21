package practicaltasks.task010;

import task010.modules.Device;
import task010.modules.company.Apple;
import task010.modules.company.Atlant;
import task010.modules.company.Horizon;
import task010.modules.technique.category.audio.Audio;
import task010.modules.technique.category.audio.MusicCenter;
import task010.modules.technique.category.video.Television;
import task010.modules.technique.category.video.Video;
import task010.modules.company.Samsung;
import task010.modules.technique.category.audio.Player;
import task010.modules.technique.category.audio.RecordPlayer;
import task010.modules.technique.category.household.Household;
import task010.modules.technique.category.household.Refrigerator;
import task010.modules.technique.category.household.WashingMachine;

/**
 *
 * @author Anatoliy
 */
public class Main {

    public static void main(String[] args) {

        Audio[] audios = {
            new MusicCenter(new Samsung(123.4F)),
            new Player(new Samsung()),
            new RecordPlayer(new Samsung(1.99F)),
            new Player(new Apple(2400.89F))
        };
        
        Video[] videos={
          new   Television(new Samsung()),
            new Television((new Horizon(578.05F)))
        };

        Household[] households = {
            new Refrigerator(new Atlant(789.23F)),
            new WashingMachine(new Atlant(899.99F))
        };

        display(audios);
        display(households);
        display(videos);
    }

    private static void display(Device[] devices) {
        for (Device device : devices) {
            System.out.println(device);
        }
    }

}
