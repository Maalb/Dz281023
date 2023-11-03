package HeroGame;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior1 = new Warrior("Berserker", 100, 100);
        Enemy enemy1 = new Enemy("Monstr1", 100);
        warrior1.attackEnemy(enemy1);
        System.out.println(enemy1.getHealth());
        if (enemy1.isAlive() == true){
            System.out.println("Враг жив");
        }else {
            System.out.println("Враг мёртв");
        }
    }
}
