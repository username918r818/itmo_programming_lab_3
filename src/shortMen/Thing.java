package shortMen;

public class Thing {
    String name;
    protected Position position;

    Thing() {
    }

    Thing(String name) {
        this.name = name;
        this.position = new Position();
    }

    Thing(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    void move(Position position) {
        if (this.position.location.equals(position.location)) {
            this.position.location.remove(this);
        }
        this.position = position;
        position.location.move(this, position);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + position.hashCode();
    }

    public boolean equals(Thing thing) {
        if (this.name.equals(thing.name) && this.position.equals(thing.position)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + "\nPosition: " + position.toString();
    }
}
