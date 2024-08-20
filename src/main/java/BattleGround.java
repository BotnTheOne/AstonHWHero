public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Mage("Botn");
        Enemy enemy = new Zombie(88);

        while(enemy.isAlive())
        {
            hero.attackEnemy(enemy);
            System.out.println("Enemy health: " + enemy.getHealth() + "\n");
        }
        System.out.println("Enemy is defeated");

    }
}