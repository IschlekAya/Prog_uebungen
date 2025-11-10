public enum Suit {
    CLUBS,   // Kreuz
    SPADES,  // Pik
    HEARTS,  // Herz
    DIAMONDS; // Karo

    static Suit fromInt(int suitNr){
        switch (suitNr) {
            case 1: return CLUBS;
            case 2: return SPADES;
            case 3: return HEARTS;
            case 4: return DIAMONDS;
        }
        return null;
    }
}
