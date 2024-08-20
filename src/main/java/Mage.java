public class Mage extends Hero{
    public Mage(String name) {
        super(name);
        setDamage(10);
        setHealth(80);
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " attack enemy with " + getDamage() + " hp!");
        enemy.takeDamage(getDamage());
    }
}