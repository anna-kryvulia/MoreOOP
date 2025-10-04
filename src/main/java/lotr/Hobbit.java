package Labka4napari.MoreOOP.src.main.java.lotr;

import Labka4napari.MoreOOP.src.main.java.lotr.strategy.HobitKickStrategy;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3, new HobitKickStrategy());
    }

    @Override
    public String getName() {
        return "Hobbit";
    }

}
