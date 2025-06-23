package Praktikum.Praktikum_6.Aufgaben.Aufgabe_3;

public class Node<T, N extends Number> {

    private T content;
    private N count;
    private Node<T, N> predecessor;

    public Node(T content, N count) {
        this.content = content;
        this.count = count;
        this.predecessor = null;
    }

    public Node(T content, N count, Node<T, N> predecessor) {
        this.content = content;
        this.count = count;
        this.predecessor = predecessor;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public N getCount() {
        return count;
    }

    public void setCount(N count) {
        this.count = count;
    }

    public Node<T, N> getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node<T, N> predecessor) {
        this.predecessor = predecessor;
    }

    public void print() {
        double total = 0.0;
        Node<T, N> current = this;
        int depth = 0;

        while (current != null) {
            String indent = "\t".repeat(depth);
            System.out.println(indent + current.getContent() + " (" + current.getCount() + ")");
            total += current.getCount().doubleValue();
            current = current.getPredecessor();
            depth++;
        }

        System.out.println("Total: " + total);
    }
}
