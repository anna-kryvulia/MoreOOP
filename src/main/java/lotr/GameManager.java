package lotr;
// import lotr.Character;

// - methods: void fight(Character c1, Character c2) 
// { to provide fight between to characters and explain via command line what happens during fight, till both of the characters are alive } 

public class GameManager {

    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1.getName() + " kicks " + c2.getName());
            System.out.println(c2.getName() + " has " + c2.getHp() + " health left.");
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println(c2.getName() + " kicks " + c1.getName());
                System.out.println(c1.getName() + " has " + c1.getHp() + " health left.");
            }
        }

        if (c1.getHp() > 0) {
            System.out.println(c1.getName() + " wins the battle!");
        } else {
            System.out.println(c2.getName() + " wins the battle!");
        }
    }

}
