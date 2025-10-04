package lotr;
import java.util.Random;

import lotr.strategy.KingKickStrategy;


// - class King 
//    - attributes: int power=from 5 to 15, int hp=from 5 to 15 
//    - methods: void kick(Character c) { decrease number of hp of the enemy by random number which will be in the range of his power }

public class King extends Character {
    private static Random RANDOM = new Random();

    public King() {
        super(RANDOM.nextInt(15 - 5) + 5, RANDOM.nextInt(15 - 5) + 5, new KingKickStrategy());
    }

    @Override
    public String getName() {
        return "King";
    }

}
