package HeroGame;

public class Enemy implements Mortal{
    private String name;
    private int health;
    private int demage;

    public Enemy(String enemy, int health) {
        this.name = enemy;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return takeDamage(demage);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    int takeDamage(int demage){
        return getHealth()-demage;
    }

    @Override
    public boolean isAlive() {
        boolean live = false;
        if (getHealth() > 0){
            live = true;
        }
        return live;
    }
}
