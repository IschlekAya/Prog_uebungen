public enum Rank {
    TWO,    // Zwei
    THREE,  // Drei
    FOUR,   // Vier
    FIVE,   // Fünf
    SIX,    // Sechs
    SEVEN,  // Sieben
    EIGHT,  // Acht
    NINE,   // Neun
    TEN,    // Zehn
    JACK,   // Bube
    QUEEN,  // Dame
    KING,   // König
    ACE;     // Ass

    // assign a rank based of an integer
    static Rank fromInt(int rankNr){
        switch(rankNr){
            case 1: return ACE;
            case 2: return TWO;
            case 3: return THREE;
            case 4: return FOUR;
            case 5: return FIVE;
            case 6: return SIX;
            case 7: return SEVEN;
            case 8: return EIGHT;
            case 9: return NINE;
            case 10: return TEN;
            case 11: return JACK;
            case 12: return QUEEN;
            case 13: return KING;
        }
        return null;    // invalid integer
    }
}
