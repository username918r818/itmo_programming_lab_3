package shortMen;

public class Position {
    protected int x, y, z;
    protected Location location;

    public Position() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Position(Location location, int x, int y) {
        this.location = location;
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Position(Location location, int x, int y, int z) {
        this.location = location;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position(Position position) {
        this.location = position.location;
        this.x = position.x;
        this.y = position.y;
        this.z = position.z;
    }

    @Override
    public int hashCode() {
        return x + y + z + location.hashCode();
    }

    public boolean equals(Position position) {

        if (this.x == position.x && this.y == position.y && this.z == position.z
                && this.location.equals(position.location)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "X: " + x + "\nY: " + y + "\nZ: " + z + "\nLocation: " + location.toString();
    }
}
