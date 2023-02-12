/**
 * FIFO represents a First-In-First-Out queue data structure. The only thing it has for a class field is an
 * integer ArrayList. This ArrayList represents this FIFO data structure. The only way an element will be added or
 * removed in this list (from an instance of the class) is through the functions addNode and removeNode. addNode
 * simply adds a node to the back of the queue (represented by an integer). removeNode removes the first node
 * in the queue as FIFO describes. Furthermore, this class is meant to be used in conjunction with
 * the BFS class (or the Breadth-First-Search Algorithm).
 * Note: The first node is the node at index zero.
 */

package Classes;
import java.util.ArrayList;

public class FIFO {

    // Class fields
    private ArrayList<Integer> queue;

    // Constructors
    /**
     *
     */
    public FIFO() {
        queue = new ArrayList<Integer>();
    }

    /**
     *
     */
    public FIFO(ArrayList<Integer> queue) {
        this.queue = queue;
    }

    // Getters
    /**
     *
     */
    public ArrayList<Integer> getQueue() {
        return queue;
    }

    /**
     *
     */
    public int getLength() {
        return queue.size();
    }

    // Setters
    /**
     *
     */
    public void setQueue(ArrayList<Integer> queue) {
        this.queue = queue;
    }

    // Helper Functions
    /**
     *
     */
    public void addNode(int node) {
        queue.add(node);
    }

    /**
     *
     */
    public int removeNode() {
        int returnNode = queue.get(0);
        queue.remove(0);
        return returnNode;
    }
}
