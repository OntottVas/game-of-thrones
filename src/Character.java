public class Character {
    private String name;
    private final String birthplace;

    public Character(String name, String birthplace) {
        this.name = name;
        this.birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }
}
