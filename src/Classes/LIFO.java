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
     * This is just a default constructor. It sets the queue variable equal to an empty ArrayList of integers.
     * It does not return anything nor does it take anything as a parameter.
     */
    public LIFO() {
        queue = new ArrayList<Integer>();
    }

    /**
     * This is a constructor taking an integer ArrayList as a parameter. It then sets this class's queue field
     * equal to that ArrayList.
     * @param queue, the integer ArrayList to be added to queue's definition
     */
    public LIFO(ArrayList<Integer> queue) {
        this.queue = queue;
    }

    // Getters
    /**
     * getQueue is a simple getter for the class field (queue). It returns only the ArrayList held in queue.
     * @return queue, the class integer ArrayList
     */
    public ArrayList<Integer> getQueue() {
        return queue;
    }

    /**
     * getLength is a getter that returns the number of elements already held in queue (even though
     * the length can be extended indefinitely, it will return only the number of elements already in the queue).
     * @return queue.size(), the length of queue
     */
    public int getLength() {
        return queue.size();
    }

    // Setters
    /**
     * setQueue is a simple setter that takes an integer ArrayList as a parameter. It then sets the class field (queue),
     * equal to this parameter.
     * @param queue, the integer ArrayList that will be the new data structure of queue
     */
    public void setQueue(ArrayList<Integer> queue) {
        this.queue = queue;
    }

    // Helper Functions
    /**
     * addNode takes the integer identification of a node and adds it to the back of the queue.
     * Note: This creates a new index at the back and places it at that index in the queue.
     * @param node, the integer identification of the node.
     */
    public void addNode(int node) {
        queue.add(node);
    }

    /**
     * removeNode removes the last item in the queue (last being the element at queue.size() - 1). It saves the integer
     * identification of that node and returns it. This method is used in the DFS step "Take a node
     * u from Q".
     * @return returnNode, the identification number of the node
     */
    public int removeNode() {
        // Save the node being removed
        int returnNode = queue.get(queue.size() - 1);

        // Remove the last node from the queue
        queue.remove(queue.size() - 1);

        // Return the saved node
        return returnNode;
    }
}
