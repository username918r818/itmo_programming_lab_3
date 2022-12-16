package shortMen;

import java.util.ArrayList;

public class ShortMan extends Thing {
    protected IsHealthy isHealthy;
    protected IsCunning isCunning;
    protected ArrayList<Thing> grabbed = new ArrayList<Thing>();

    ShortMan(String name, Position position, IsHealthy isHealthy, IsCunning isCunning) {
        this.name = name;
        this.position = position;
        this.isHealthy = isHealthy;
        this.isCunning = isCunning;
    }

    @Override
    void move(Position position) {
        if (this.position.location.equals(position.location)) {
            for (Thing grabbedThing : grabbed) {
                grabbedThing.position.location.remove(grabbedThing);
            }
            this.position.location.remove(this);
        } else if (position.location.hasGravity()) {
            if (this.isHealthy == IsHealthy.SICK || this.isCunning == IsCunning.CUNNING) {
                return;
            }
        }
        this.position = new Position(position);
        position.location.move(this, position);
        this.bring(position);
    }

    protected void bring(Position position) {
        if (this.position.location.equals(position.location)) {
            for (Thing grabbedThing : grabbed) {
                grabbedThing.position.location.remove(grabbedThing);
            }
        }
        this.position = new Position(position);
        for (Thing grabbedThing : grabbed) {
            grabbedThing.position = new Position(position);
            position.location.move(grabbedThing, position);
        }
    }

    void grab(Thing thing) {
        if (grabbed.indexOf(thing) != -1) {
            grabbed.add(thing);
        }
        if (!this.position.location.equals(thing.position.location)) {
            thing.position.location.remove(thing);

        }
        this.position.location.move(thing, this.position);
    }

    void drop(Thing thing) {
        int index = grabbed.indexOf(thing);
        if (index != -1) {
            grabbed.remove(index);
        }
    }

    @Override
    public int hashCode() {
        int a = 0;
        if (isCunning == IsCunning.CUNNING) {
            a++;
        }
        if (isHealthy == IsHealthy.SICK) {
            a += 2;
        }
        return super.hashCode() + a + grabbed.hashCode();
    }

    public boolean equals(ShortMan shortMan) {
        if (super.equals(shortMan) && this.isCunning == shortMan.isCunning && this.isHealthy == shortMan.isHealthy
                && this.grabbed.equals(shortMan.grabbed)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + isCunning + ' ' + isHealthy + "\nGrabbed: " + grabbed;
    }
}
