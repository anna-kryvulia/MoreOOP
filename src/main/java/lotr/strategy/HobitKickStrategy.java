package lotr.strategy;
import lotr.Character;

public class HobitKickStrategy extends KickStrategy {
    @Override
    public void kick(Character main, Character enemy) {
        System.out.println("Cry a lot");
    }

}
