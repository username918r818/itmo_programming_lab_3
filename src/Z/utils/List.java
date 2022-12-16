package Z.utils;

public class List<T> {
    protected ListElement<T> first = null;
    protected int length = 0;

    public List() {
    }

    public List(T item) {
        this.first = new ListElement<T>(item);
        this.length = 1;
    }

    public void add(T item) {
        if (this.find(item)) {
            return;
        }
        this.length++;
        ListElement<T> a = first;
        if (first == null) {
            first = new ListElement<T>(item);
            return;
        }
        while (a.next != null) {
            a = a.next;
        }
        a.next = new ListElement<T>(item);
    }

    public void remove(T item) {
        ListElement<T> a = first;
        if (first == null) {
            return;
        }
        if (a.item == item) {
            first = first.next;
        }
        while (a.next != null && a.next.item != item) {
            a = a.next;
        }
        if (a.next == null) {
            return;
        }
        a.next = a.next.next;
        this.length--;
    }

    public boolean find(T item) {
        ListElement<T> a = first;
        if (first == null) {
            return false;
        }
        if (a.item == item) {
            return true;
        }
        while (a.next != null && a.next.item != item) {
            a = a.next;
        }
        if (a.next == null) {
            return false;
        }
        return true;
    }

}
