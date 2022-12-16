package shortMen;

public class Outdoors extends Space {
    public String[] streets;

    public Outdoors(String[] streets) {
        this.streets = streets;
        this.gravity = Gravity.NONE;
    }

    public Outdoors(String[] streets, Gravity gravity) {
        this.streets = streets;
        this.gravity = gravity;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + streets.hashCode();
    }

    public boolean equals(Outdoors outdoors) {
        if (super.equals(outdoors) && this.streets.equals(outdoors.streets)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStreets: " + this.streets;
    }
}
