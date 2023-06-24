package combat;

public class RangedWeapon extends Weapon {

    private int ammunition;
    public RangedWeapon(String name, int damage, int range, int ammunition) {
        super(name, damage, range);
        this.ammunition = ammunition;
    }


}
