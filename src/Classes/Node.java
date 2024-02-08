/**
 * This Node class represents a node in a linked list. Each node holds both the identification of it (an integer)
 * and an object of the node it points to. This is meant to be used in an adjacency list.
 * CITATION (MLA): Inspiration comes from:
 * Getting started with data structures: Nodes cheatsheet. Codecademy. (n.d.). Retrieved February 11, 2023, from
 *      https://www.codecademy.com/learn/getting-started-with-data-structures-java/modules/nodes-java/cheatsheet
 */

package Classes;

public class Node {
    // Class fields
    int node;
    Node nextNode;

    // Constructors
    /**
     * This is a default constructor. It sets the node field equal to -1 and the nextNode field equal to null.
     * Note: I am assuming nodes can be numerically identified starting at 0 and ending at n.
     * However, I realize this may not always be the case (i.e., node -1).
     */
    public Node() {
        node = -1;
        nextNode = null;
    }

    /**
     * This is a constructor that sets the integer node field equal to the integer node parameter. It also sets
     * the Node object nextNode field equal to the user given next node.
     * @param node, the integer node identifier
     * @param nextNode, the physical Node object next in line (null if no more nodes to traverse)
     */
    public Node(int node, Node nextNode) {
        this.node = node;
        this.nextNode = nextNode;
    }

    // Getters
    /**
     * getNode is a simple getter that returns the value held in the integer node identifier 'node'.
     * @return node, the integer node identifier
     */
    public int getNode() { return node; }

    /**
     * getNextNode is a simple getter that returns the Node held in the Node object nextNode (the next Node in line).
     * @return nextNode, the Node object to be returned
     */
    public Node getNextNode() { return nextNode; }

    // Setters
    /**
     * setNode is a simple setter that sets the integer node identifier field equal to the user given integer node
     * identifier.
     * @param node, the user given integer node identifier
     */
    public void setNode(int node) { this.node = node; }

    /**
     * setNextNode is a simple setter that sets the Node nextNode field equal to a user given Node.
     * @param nextNode, the user given Node
     */
    public void setNextNode(Node nextNode) { this.nextNode = nextNode; }

    // toString
    /**
     * toString is an overridden method that overrides Object's toString method. It returns the numerical identifier of
     * the node and the numerical identifier of the node it points to.
     * @return the formatted string described above
     */
    @Override
    public String toString() { return getNode() + ", Next Node: " + getNextNode(); }
}
