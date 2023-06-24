package combat.type;

public enum RangedWeaponType {
    BOW("bow"),
    CROSSBOW("crossbow"),
    THROWING_KNIFE("throwing knife"),
    JAVELIN("javelin");

    private final String name;

    private RangedWeaponType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RangedWeaponType{" +
                "name='" + name + '\'' +
                '}';
    }
}
