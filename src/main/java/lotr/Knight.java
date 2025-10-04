package Labka4napari.MoreOOP.src.main.java.lotr;
import java.util.Random;

import Labka4napari.MoreOOP.src.main.java.lotr.strategy.KickStrategy;

// - class Knight 
//    - attributes: int power=from 2 to 12, int hp=from 2 to 12
//    - methods: void kick(Character c) { like King }

public class Knight extends Character {
    private static Random RANDOM = new Random();

    public Knight() {
        super(RANDOM.nextInt(12 - 2) + 2, RANDOM.nextInt(12 - 2) + 2, new KnightKickStrategy());
    }

    @Override
    public String getName() {
        return "Knight";
    }

    // @Override
    // public void kick(Character enemy) {
    //     if (enemy.isAlive()) {
    //         enemy.setHp(enemy.getHp() - RANDOM.nextInt(this.getPower()));
    //     }
    // }


}
