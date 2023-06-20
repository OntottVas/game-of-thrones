public enum House {
    STARK("Winter is Coming", "Közeleg a tél"),
    LANNISTER("Hear me Roar", "Halld üvöltésem"),
    TARGARYEN("Fire and Blood", "Tűz és vér"),
    BARATHEON("Ours is the Fury", "Miénk a harag"),
    GREYJOY("We Do Not Sow", "Mi nem vetünk"),
    TYRELL("Growing Strong", "Erőssé növünk");

    private final String motto;
    private final String hunMotto;

     House(String motto, String hunMotto){
        this.motto = motto;
        this.hunMotto = hunMotto;
    }

    public String getMotto() {
        return motto;
    }

    public String getHunMotto() {
        return hunMotto;
    }
}
