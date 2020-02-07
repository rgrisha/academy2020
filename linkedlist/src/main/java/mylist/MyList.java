package mylist;

public class MyList<T> {


    Node<T> first;
    Node<T> last;

    public MyList() {

    }

    public void insertFirst(T value) {
        Node<T> node = new Node<>(value);
        if(last == null) {
            last = node;
        }
        if(first == null) {
            first = node;
        } else {
            node.tail = first;
            first = node;
        }
    }
   
}