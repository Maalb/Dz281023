package HeroGame;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy("Monstr", 100);
        Hero archer = new Archer("Лучник", 100, 30);

        Hero warrior = new Warrior("Воин", 100, 45);
        System.out.println(warrior.getName());

//        Hero mage = new Mage("Маг", 100, 45);
//        System.out.println(mage.getName());
//        mage.attackEnemy();

    }
}
