public abstract class Hero implements Mortal{
    private final String name;
    private int damage;
    private int health;

    public Hero(String name) {
        this.name = name;
    }
    public abstract void attackEnemy(Enemy enemy);
    public void takeDamage(int damage) {
        this.health -= damage;
        if (health <= 0) {
            this.health = 0;
        }
    }
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    protected void setHealth(int health) {
        this.health = health;
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}