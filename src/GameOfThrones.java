import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character c1 = new Noble("Harold The Great",
                                    "Winterfell", Gender.FEMALE, Set.of(House.BARATHEON), 500);

        c1.setGender(Gender.EUNUCH);

        System.out.println(c1.getGender());

        System.out.println(c1);
    }
}
