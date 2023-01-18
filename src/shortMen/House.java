package shortMen;

public class House extends Space {
    public String address;

    public House(String name) {
        this.address = name;
        this.gravity = Gravity.NONE;
    }

    public House(String name, Gravity gravity) {
        this.address = name;
        this.gravity = gravity;
    }

    


    @Override
    public int hashCode() {
        return super.hashCode() + address.hashCode();
    }

    public boolean equals(House house) {
        if (super.equals(house) && this.address.equals(house.address)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAddress: " + this.address;
    }
}
