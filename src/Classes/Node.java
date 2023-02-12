/**
 * This Node class represents a node in a linked list. Each node holds both the identification of it (an integer)
 * and an object of the node it points to. This is meant to be used in an adjacency list.
 * CITATION: Inspiration comes from
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
     *
     */
    public Node() {
        node = -1;
        nextNode = null;
    }

    /**
     *
     */
    public Node(int node, Node nextNode) {
        this.node = node;
        this.nextNode = nextNode;
    }

    // Getters
    /**
     *
     */
    public int getNode() {
        return node;
    }

    /**
     *
     */
    public Node getNextNode() {
        return nextNode;
    }

    // Setters
    /**
     *
     */
    public void setNode(int node) {
        this.node = node;
    }

    /**
     *
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    // toString
    /**
     *
     */
    @Override
    public String toString() {
        return getNode() + ", Next Node: " + getNextNode();
    }
}
