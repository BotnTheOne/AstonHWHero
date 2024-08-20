public class TrainingGround {
    public static void main(String[] args) {
        testBattle();
    }

    public static void testBattle() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Warrior("MegaPixar");
        heroes[1] = new Archer("Stoub");
        heroes[2] = new Mage("Botn");
        Enemy enemy1 = new Zombie(82);

        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");

        for(Hero hero: heroes) {hero.attackEnemy(enemy1);}
        enemy1.attackHero(heroes[0]);
        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");

        for(Hero hero: heroes) {hero.attackEnemy(enemy1);}
        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");
    }

    public static void showHealthOfHeroes(Hero[] heroes) {
        System.out.print("Heroes: ");
        for (Hero hero : heroes) {
            System.out.print(hero.getName() + " " + hero.getHealth() + "hp\t");
        }
        System.out.println();
    }
}