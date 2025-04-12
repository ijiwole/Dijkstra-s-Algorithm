package model;

public class Node implements Comparable<Node> {
    public String name;
    public int distance;

    public Node(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}
