package lotr;
// import lotr.Character;
// import lotr.strategy.*;

import java.util.Random;

public class CharacterFactory {
    private static Random RANDOM = new Random();

    public Character createCharacter() {

        int characterType = RANDOM.nextInt(4);

        if (characterType == 0) {
            Character character = new King();
            return (character);
        } else if (characterType == 1) {
            Character character = new Knight();
            return (character);
        } else if (characterType == 2) {
            Character character = new Elf();
            return (character);
        } else {
            Character character = new Hobbit();
            return (character);
        }
    }
}
