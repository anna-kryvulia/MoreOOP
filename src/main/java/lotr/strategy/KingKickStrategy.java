package Labka4napari.MoreOOP.src.main.java.lotr.strategy;
import java.util.Random;

import Labka4napari.MoreOOP.src.main.java.lotr.Character;

public class KingKickStrategy extends KickStrategy{
    private static Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        if (enemy.isAlive()) {
            enemy.setHp(enemy.getHp() - RANDOM.nextInt(main.getPower()));
        }
    }

}
