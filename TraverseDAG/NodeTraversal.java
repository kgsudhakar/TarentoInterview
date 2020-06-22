package TraverseDAG;

import java.util.ArrayList;
import java.util.List;

public class NodeTraversal {
    public static void walk(Node node, String currentPath) {
        List<Node> children = node.getChildren();
        for (Node childNode : children) {
            String currentPathToChild = "";
            if(currentPath.length() == 0) {
                currentPathToChild = node.getName();
            } else {
                currentPathToChild = currentPath + "->" + node.getName();
            }
            walk(childNode, currentPathToChild);
        }
        if(children.size() == 0) {
                System.out.println(currentPath + "->" + node.getName());
        }
    }
    public static void main(String[] args) {
        Node node = Node.getSampleNode();
        List paths = new ArrayList<>();
        walk(node,"");
    }
}