package HeroGame;

public class Mage extends Hero implements Mortal{
    public Mage(String name, int health, int demage) {
        super(name, health, demage);
        health = 100;
        demage = 45;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + "Атакую врага!" + enemy.getName());
        enemy.takeDamage(getDemage());
    }

    @Override
    public boolean isAlive() {
        boolean live = false;
        if (getDemage()> 0){
            live = true;
        }
        return live;
    }
}
