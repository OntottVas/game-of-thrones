package combat;

import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {

    private RangedWeaponType type;
    private int ammunition;
    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType type) {
        super(name, damage, range);
        this.ammunition = ammunition;
        this.type = type;
    }

    @Override
    public void attack() {
        super.attack();
        ammunition--;
    }

    @Override
    public String toString() {
        return "[combat.RangedWeapon{" +
                "type=" + type + super.toString() +
                ", ammunition=" + ammunition;
    }
}
