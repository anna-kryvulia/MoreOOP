package lotr.strategy;
import lotr.Character;

public class ElfKickStrategy extends KickStrategy{

    @Override
    public void kick(Character main, Character enemy) {
        if (main.getPower() > enemy.getPower()) {
            enemy.setHp(0);
        } else {
            enemy.setPower(enemy.getPower() - 1);
        }
    }

}
