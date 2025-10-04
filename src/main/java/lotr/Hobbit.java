package lotr;
import lotr.strategy.HobitKickStrategy;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3, new HobitKickStrategy());
    }

    @Override
    public String getName() {
        return "Hobbit";
    }

}
