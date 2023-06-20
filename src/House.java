public enum House {
    STARK("Winter is Coming", "Közeleg a tél", "wolf"),
    LANNISTER("Hear me Roar", "Halld üvöltésem", "lion"),
    TARGARYEN("Fire and Blood", "Tűz és vér", "dragon"),
    BARATHEON("Ours is the Fury", "Miénk a harag", "stag"),
    GREYJOY("We Do Not Sow", "Mi nem vetünk", "kraken"),
    TYRELL("Growing Strong", "Erőssé növünk", "rose");

    private final String motto;
    private final String hunMotto;

    private final String sigil;

     House(String motto, String hunMotto, String sigil){
        this.motto = motto;
        this.hunMotto = hunMotto;
        this.sigil = sigil;
    }

    public String getMotto() {
        return motto;
    }

    public String getHunMotto() {
        return hunMotto;
    }

    public String getSigil() {
        return sigil;
    }

    @Override
    public String toString() {
         return this.name();
    }
}
