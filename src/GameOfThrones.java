import combat.MeleeWeapon;
import combat.RangedWeapon;
import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        /*Character c1 = new Noble("Harold The Great",
                                    "Winterfell", Gender.FEMALE, Set.of(House.BARATHEON), 500);

        c1.setGender(Gender.EUNUCH);

        System.out.println(c1.getGender());

        System.out.println(c1);*/

        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE, Set.of(House.STARK));
        System.out.println(arya.hasWeapons()); // False

        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, MeleeWeaponType.DAGGER));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [combat.MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]



        Noble cersei = new Noble("Cersei", "Casterly Rock", Gender.FEMALE, Set.of(House.LANNISTER));
        cersei.addHouse(House.BARATHEON);
        cersei.addWealth("gold", 1); // 1 gold -> 100 copper
        cersei.addWealth("silver", 1);
        cersei.addWealth("silver", 2); // 1+2 silver -> 30 copper
        cersei.addWealth("copper", 3); // 3 copper -> 3 copper
        System.out.println(cersei); // Cersei of house(s) LANNISTER, BARATHEON has 133 wealth in copper.
    }
}
