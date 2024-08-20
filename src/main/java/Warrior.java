public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
        setDamage(22);
        setHealth(100);
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " attack enemy with " + getDamage() + " hp!");
        enemy.takeDamage(getDamage());
    }
}