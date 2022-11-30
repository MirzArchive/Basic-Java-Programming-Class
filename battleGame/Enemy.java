package battleGame;
public class Enemy extends Entity{
    int baseAtk;
    String type;

    Enemy(String name, int health, int baseAtk, String type) {
        super(name, health);
        this.baseAtk = baseAtk;
        this.type = type;
    }

    void doAttack (Hero theHero) {
        theHero.health -= baseAtk;
    }
}
