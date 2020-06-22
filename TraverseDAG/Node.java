package TraverseDAG;

import java.util.ArrayList;
import java.util.List;

/**
 * Node representation of the graph.
 */
public class Node {
    private final String name;
    private final List<Node> children;

    public Node(final String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public List<Node> getChildren() {
        return new ArrayList<>(children);
    }

    public String getName() {
        return name;
    }

    public void addChildren(Node... children) {
        for (Node child : children) {
            this.children.add(child);
        }
    }

    public static Node getSampleNode() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");
        Node node7 = new Node("7");
        Node node8 = new Node("8");
        Node node9 = new Node("9");
        Node node10 = new Node("10");
        node1.addChildren(node2, node3, node4, node5);
        node2.addChildren(node6);
        node3.addChildren(node6, node7);
        node4.addChildren(node7, node8);
        node5.addChildren(node8);
        node7.addChildren(node9);
        node8.addChildren(node10);
        return node1;
    }
}
