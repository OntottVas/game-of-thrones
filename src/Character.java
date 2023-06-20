public class Character implements Mortal {
    private String name;
    private final String birthplace;
    private Gender gender;
    private static int worldPopulation = 0;

    public Character(String name, String birthplace, Gender gender) {
        this.name = name;
        this.birthplace = birthplace;
        this.gender = gender;
        worldPopulation++;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if(this.gender == Gender.MALE &&
                gender == Gender.EUNUCH){
            this.gender = gender;
        }
    }

    // other solution
    public void castration(){
        if(this.gender == Gender.MALE){
            this.gender = Gender.EUNUCH;
        }
    }

    public static int getWorldPopulation() {
        return worldPopulation;
    }

    @Override
    public void die() {
        worldPopulation--;
    }
}
