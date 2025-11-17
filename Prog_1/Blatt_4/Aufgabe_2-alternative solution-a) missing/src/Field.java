// Properties a Field on the Board can have
public enum Field {
    RED,
    YELLOW,
    EMPTY;

    public static Field toField(Player p){
        switch (p){
            case RED: return RED;
            case YELLOW: return YELLOW;
            default: return null;
        }
    }
}
