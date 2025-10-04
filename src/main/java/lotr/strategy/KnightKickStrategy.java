package lotr.strategy;
import java.util.Random;

import lotr.Character;

public class KnightKickStrategy extends KickStrategy{
    private static Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        if (enemy.isAlive()) {
            enemy.setHp(enemy.getHp() - RANDOM.nextInt(main.getPower()));
        }
    }

}
