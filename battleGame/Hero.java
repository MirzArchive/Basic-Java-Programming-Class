package battleGame;
public class Hero extends Entity{
    int baseAtk;
    String roles;

    Hero(String name, int health, int baseAtk, String roles) {
        super(name, health);
        this.baseAtk = baseAtk;
        this.roles = roles;
    }

    void doAttack (Enemy theEnemy) {
        theEnemy.health -= baseAtk;
    }

}
