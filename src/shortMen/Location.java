package shortMen;

public interface Location {
    boolean hasGravity();

    void move(Thing thing, Position position);

    void remove(Thing thing);
}
