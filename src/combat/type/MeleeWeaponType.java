package combat.type;

public enum MeleeWeaponType {
    SWORD("sword"),
    AXE("axe"),
    MACE("mace"),
    SPEAR("spear"),
    DAGGER("dagger");

    private final String name;

    private MeleeWeaponType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
