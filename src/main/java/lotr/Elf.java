package Labka4napari.MoreOOP.src.main.java.lotr;

import Labka4napari.MoreOOP.src.main.java.lotr.strategy.ElfKickStrategy;

// - class Elf 
//    - attributes: int power=10, int hp=10
//    - methods: void kick(Character c) { kill everybody weaker than him, otherwise decrease the power of character by 1 }
public class Elf extends Character {

    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }

    @Override
    public String getName() {
        return "Elf";
    }

    // @Override
    // public void kick(Character character) {
    //     if (this.getPower() > character.getPower()) {
    //         character.setHp(0);
    //     } else {
    //         character.setPower(character.getPower() - 1);
    //     }
        
    // }

}
