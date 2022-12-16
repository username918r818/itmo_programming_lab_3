package shortMen;

import java.util.Map;

abstract public class Space implements Location {
    protected Map<Thing, Position> map;
    protected Gravity gravity;

    Space() {
        this.gravity = Gravity.NONE;
    }

    Space(Gravity gravity) {
        this.gravity = gravity;
    }

    @Override
    public boolean hasGravity() {
        if (this.gravity == Gravity.NONE) {
            return false;
        }
        return true;
    }

    @Override
    public void move(Thing thing, Position position) {
        position = new Position(position);
        map.put(thing, position);
    }

    @Override
    public void remove(Thing thing) {
        map.remove(thing);
    }

    @Override
    public int hashCode() {
        if (this.gravity == Gravity.NONE) {
            return map.hashCode() + 12673;
        }
        return map.hashCode();
    }

    public boolean equals(Space space) {
        if (this.map.equals(space.map) && this.gravity == space.gravity) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Entities: " + map.toString() + "\nGravity: " + gravity;
    }
}
