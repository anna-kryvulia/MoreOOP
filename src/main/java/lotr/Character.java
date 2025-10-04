package lotr;
import lotr.strategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive() {
        return hp > 0;
    }   

    public void kick(Character character){
        kickStrategy.kick(this, character);
    }

    public abstract String getName();
}
