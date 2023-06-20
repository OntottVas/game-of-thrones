public class GameOfThrones {
    public static void main(String[] args) {
        Character c1 = new Character("Harold The Great",
                                    "Winterfell", Gender.FEMALE);

        c1.setGender(Gender.EUNUCH);

        System.out.println(c1.getGender());
    }
}
