class Node<T> {
    T item;
    Node<T> next;
    Node<T> prev;

    public Node(T item) {
        this.item = item;
        this.next = null;
        this.prev = null;
    }
}