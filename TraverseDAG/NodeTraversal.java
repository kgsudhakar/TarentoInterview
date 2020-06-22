package TraverseDAG;

import java.util.ArrayList;
import java.util.List;

/**
 * This class traverses from the top node to bottom to print all possible path.
 */
public class NodeTraversal {
    
    /**
     * Recursive method to obtain and print all possible path traversing from the given node.
     * When each node is processed, path to that node from the top is passed as input.
     * The printed path will be like 1->2->3
     *
     * @param node - Node to start traversal.
     * @param currentPath - This represents the path to the given node from the top node.
     */    
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
