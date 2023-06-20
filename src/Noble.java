import java.util.HashSet;
import java.util.Set;

public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();
    private int wealth;

    Noble(String name, String birthplace, Gender gender, Set<House> houses, int wealth) {
        super(name, birthplace, gender);
        this.wealth = wealth;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public Set<House> getHouse() {
        return this.houses;
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public void removeHouse(House house) {
        this.houses.remove(house);
    }

    @Override
    public String toString() {
        return super.getName() + " of house " + getHousesString() +
                " has " + this.wealth + " gold dragons.";
    }

    public String getHousesString() {
        String string = "";
        for (House house : houses) {
            string += house + ", ";
        }
        return string.substring(0, string.length() - 2);
    }
}
