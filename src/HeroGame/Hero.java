package HeroGame;

abstract public class Hero {
    private String name;
    private int health;
    private  int demage;


    public Hero(String name, int health, int demage) {
        this.name = name;
        this.health = health;
        this.demage = demage;

    }

    public String getName() {
        return name;
    }

    public int getDemage() {
        return demage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
