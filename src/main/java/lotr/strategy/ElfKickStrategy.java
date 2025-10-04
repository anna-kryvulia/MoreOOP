package Labka4napari.MoreOOP.src.main.java.lotr.strategy;
import Labka4napari.MoreOOP.src.main.java.lotr.Character;

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
