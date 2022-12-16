package Z.utils;

public class ListElement<T> {
    protected T item;
    protected ListElement<T> next = null;

    protected ListElement() {
    }

    protected ListElement(T item) {
        this.item = item;
    }

}
