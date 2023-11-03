package HeroGame;

public class Archer extends Hero implements Mortal{
    public Archer(String name, int health, int demage) {
        super(name, health, demage);
        health = 100;
        demage = 30;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + "Атакую, " + enemy.getName());
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
