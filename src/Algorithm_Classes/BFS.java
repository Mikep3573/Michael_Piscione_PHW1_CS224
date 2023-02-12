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
     *
     */
    public BFS() {
        queue = new FIFO();
        node = -1;
    }

    /**
     *
     */
    public BFS(FIFO queue, int node) {
        this.queue = queue;
        this.node = node;
    }

    // Getters
    /**
     *
     */
    public FIFO getQueue() {
        return queue;
    }

    /**
     *
     */
    public int getNode() {
        return node;
    }

    // Setters
    /**
     *
     */
    public void setQueue(FIFO queue) {
        this.queue = queue;
    }

    /**
     *
     */
    public void setNode (int node) {
        this.node = node;
    }

    // Algorithm
    /**
     *
     */
    public void bFSAlgorithm(ArrayList<Node> adjacencyList) {
        // Initialize Q to be a FIFO queue with one element s
        ArrayList<Integer> orderOfDiscovered = new ArrayList<Integer>();
        queue.addNode(node);
        String nodeOrder = "BFS with start node " + node + " discovers nodes in the following order: ";
        boolean[] Discovered = new boolean[adjacencyList.size()];
        while(queue.getLength() != 0) {
            node = queue.removeNode();
            if (!Discovered[node]) {
                Discovered[node] = true;
                orderOfDiscovered.add(node);
                Node v = adjacencyList.get(node).getNextNode();
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

        for (int i = 0; i < orderOfDiscovered.size(); i++) {
            if (i != orderOfDiscovered.size() - 1) {
                nodeOrder = nodeOrder + orderOfDiscovered.get(i) + ", ";
            }
            else {
                nodeOrder = nodeOrder + orderOfDiscovered.get(i) + ".";
            }
        }
        System.out.println(nodeOrder);
    }
}
