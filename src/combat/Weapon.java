package combat;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public void attack() {

    }
}
