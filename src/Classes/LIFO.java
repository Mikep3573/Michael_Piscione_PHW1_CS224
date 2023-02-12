/**
 * LIFO represents a Last-In-First-Out queue data structure. The only thing it has for a class field is an
 * integer ArrayList. This ArrayList represents this LIFO data structure. The only way an element will be added or
 * removed from this list (from an instance of the class) is through the functions addNode and removeNode.
 * addNode simply adds a node to the back of the queue (represented by an integer).
 * removeNode removes the last node in the queue as LIFO describes. Furthermore, this class is meant to be used in
 * conjunction with the DFS class (or the Depth-First-Search Algorithm).
 * Note: The last node is the node at index queue.size() - 1.
 */

package Classes;
import java.util.ArrayList;

public class LIFO {

    // Class fields
    private ArrayList<Integer> queue;

    // Constructors
    /**
     *
     */
    public LIFO() {
        queue = new ArrayList<Integer>();
    }

    /**
     *
     */
    public LIFO(ArrayList<Integer> queue) {
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
        int returnNode = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return returnNode;
    }
}
