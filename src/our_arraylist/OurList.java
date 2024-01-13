package our_arraylist;

public interface OurList<E> {

    void append(E object);

    E get (int index);
    void set (E object, int index);
    int size ();
    boolean remove( E object);

    E removeByID (int index);
}
