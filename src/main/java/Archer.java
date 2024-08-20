public class Archer extends Hero{
    public Archer(String name) {
        super(name);
        setDamage(15);
        setHealth(90);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " attack enemy with " + getDamage() + " hp!");
        enemy.takeDamage(getDamage());
    }
}