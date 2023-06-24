import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noble extends Character {
    private final Set<House> houses = new HashSet<>();
    private Map<String, Integer> coins = new HashMap<>();

    Noble(String name, String birthplace, Gender gender, Set<House> houses) {
        super(name, birthplace, gender);
    }

    public void addWealth(String currency, int value) {
        this.coins.put(currency, value);
    }

    public void removeWealth(String currency, int value) {
        this.coins.remove(currency, value);
    }

    public int getWealth() {
        int sum = 0;
        for (var actual : coins.entrySet()) {
            String currency = actual.getKey();
            switch (currency) {
                case "gold" -> sum += actual.getValue() * 100;
                case "silver" -> sum += actual.getValue() * 10;
                case "copper" -> sum += actual.getValue();
                default -> {}
            }
        }
        return sum;
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
                getWealth() + " wealth in copper";
    }

    public String getHousesString() {
        String string = "";
        for (House house : houses) {
            string += house + ", ";
        }
        return string.substring(0, string.length() - 1);
    }

    @Override
    public void die() {
        for (var actual : houses) {
            System.out.println(actual.getMotto());
        }
        super.die();
    }

}
