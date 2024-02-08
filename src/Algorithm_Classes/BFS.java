/**
 * This BFS class is identical to the DFS class except it holds a FIFO queue. This class is meant to run the
 * Breadth-First-Search algorithm. Each BFS instance holds both a FIFO queue and a starting node as class fields.
 * The bFSAlgorithm function uses this information in conjunction with an adjacency list in order to
 * discover all nodes that have a path to the starting node.
 */

package Algorithm_Classes;
import Classes.*;
import java.util.ArrayList;

public class BFS {
    // Class fields
    private FIFO queue;
    private int node;

    // Constructors
    /**
     * This is a default constructor that sets the class fields queue and node equal to a default FIFO instance and
     * -1 respectively. Where queue is a FIFO object and node is an integer identifier of the starting node.
     */
    public BFS() {
        queue = new FIFO();
        node = -1;
    }

    /**
     * This is a constructor that sets the class fields queue and node equal to a user input FIFO object and integer
     * node identifier respectively.
     * @param queue, the user's FIFO object for queue to be set equal to
     * @param node, the user's integer node identifier of the starting node
     */
    public BFS(FIFO queue, int node) {
        this.queue = queue;
        this.node = node;
    }

    // Getters
    /**
     * getQueue is a simple getter that returns a FIFO object that is the class field 'queue'.
     * @return FIFO, the FIFO class instance held in queue
     */
    public FIFO getQueue() {
        return queue;
    }

    /**
     * getNode is a simple getter that returns the integer node identifier stored in the class field 'node'.
     * @return node, the integer node identifier held in the class field node
     */
    public int getNode() {
        return node;
    }

    // Setters
    /**
     * setQueue is a simple setter that sets the class field FIFO object 'queue' equal to the FIFO object given by
     * the user.
     * @param queue, the FIFO object given by the user
     */
    public void setQueue(FIFO queue) {
        this.queue = queue;
    }

    /**
     * setNode is a simple setter that sets the class field integer node identifier 'node' equal to the integer node
     * identifier given by the user.
     * @param node, the integer node identifier given by the user
     */
    public void setNode(int node) {
        this.node = node;
    }

    // Algorithm
    /**
     * bFSAlgorithm takes an adjacency list representation of an undirected graph and proceeds to traverse each edge
     * leading to a node that has a path to the class field node (starting node). It then returns a formatted string
     * representing the node traversal order. This uses the Breadth-First-Search algorithm as a means of traversal.
     * @param ArrayList<Node>, the adjacency list representation of the undirected graph
     */
    public void bFSAlgorithm(ArrayList<Node> adjacencyList) {
        // Initialize an ordered list of Discovered nodes (used for printing the order of nodes discovered)
        ArrayList<Integer> orderOfDiscovered = new ArrayList<Integer>();

        // Add the first node to the queue (both class fields and the queue is a FIFO queue)
        queue.addNode(node);

        // Initialize the string to be used as output
        String nodeOrder = "BFS with start node " + node + " discovers nodes in the following order: ";

        // Initialize an array of nodes to be Discovered (used in the algorithm)
        boolean[] Discovered = new boolean[adjacencyList.size()];

        // While there are still nodes to be looked at, take a node from the queue (from the front), and discover it
        while(queue.getLength() != 0) {
            node = queue.removeNode();
            if (!Discovered[node]) {
                Discovered[node] = true;

                // Add the discovered node to the ordered discovered list
                orderOfDiscovered.add(node);

                // Set the new node v to be the node that the current node is pointing to in the adjacency list
                Node v = adjacencyList.get(node).getNextNode();

                // Consider all edges incident to u and add to queue if connecting node(s) is not discovered yet
                for (int i = 0; i < adjacencyList.size(); i++) {
                    if (v != null) {
                        if (!Discovered[v.getNode()]) {
                            queue.addNode(v.getNode());
                        }
                        v = v.getNextNode();
                    }
                }
            }
        }

        // Print a formatted list depicting the order of nodes discovered
        for (int i = 0; i < orderOfDiscovered.size(); i++) {
            // Add a trailing comma if it is not the last in the list
            if (i != orderOfDiscovered.size() - 1) {
                nodeOrder = nodeOrder + orderOfDiscovered.get(i) + ", ";
            }
            // Add a period if it is the last in the list
            else {
                nodeOrder = nodeOrder + orderOfDiscovered.get(i) + ".";
            }
        }
        System.out.println(nodeOrder);
    }
}
