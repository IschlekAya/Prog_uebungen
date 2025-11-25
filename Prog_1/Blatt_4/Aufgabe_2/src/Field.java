// Properties a Field on the Board can have
public enum Field {
    CROSS,
    CIRLCE,
    EMPTY;

    public static Field toField(Player p){
        switch (p){
            case CROSS: return CROSS;
            case CIRCLE: return CIRLCE;
            default: return null;
        }
    }
}
