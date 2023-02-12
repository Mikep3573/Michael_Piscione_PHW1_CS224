/**
 * This main function prompts the user for their choice of algorithm (Breadth-First-Search or Depth-First-Search)
 * and their choice of starting node. Using this information the searching algorithms look through the graph structure
 * (represented as an adjacency list) for all nodes that have a path to the starting node. Once this is done,
 * the algorithms return the order of nodes 'visited'.
 */

import Classes.*;
import Algorithm_Classes.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Make Adjacency List
        ArrayList<Node> adjacencyList = new ArrayList<Node>();

        // Fill location zero with garbage (won't be accessed using this coding assignment's adjacency list)
        adjacencyList.add(0, new Node());

        // Add linked list consisting of all edges to node one
        adjacencyList.add(1, new Node(1, new Node(2, new Node(3, null))));

        // Add linked list consisting of all edges to node two
        adjacencyList.add(2, new Node(2, new Node(1, new Node(3, new Node(4, new Node(5, null))))));

        // Add linked list consisting of all edges to node three
        adjacencyList.add(3, new Node(3, new Node(1, new Node(2, new Node(5, new Node(7, new Node(8, null)))))));

        // Add linked list consisting of all edges to node four
        adjacencyList.add(4, new Node(4, new Node(2, new Node(5, null))));

        // Add linked list consisting of all edges to node five
        adjacencyList.add(5, new Node(5, new Node(2, new Node(3, new Node(4, new Node(6, null))))));

        // Add linked list consisting of all edges to node six
        adjacencyList.add(6, new Node(6, new Node(5, null)));

        // Add linked list consisting of all edges to node seven
        adjacencyList.add(7, new Node(7, new Node(3, new Node(8, null))));

        // Add linked list consisting of all edges to node eight
        adjacencyList.add(8, new Node(8, new Node(3, new Node(7, null))));

        // Create LIFO and FIFO queue objects
        LIFO lQueue = new LIFO();
        FIFO fQueue = new FIFO();


        // Prompt user for choice of starting node
        System.out.print("What node would you like to start with?: ");

        // Get user choice of starting node
        boolean valid = false;
        int nodeChoice = 0;
        while (!valid) { // Check for valid input
            Scanner input = new Scanner(System.in);
            valid = true;
            try {
                 nodeChoice = input.nextInt();
            } catch (Exception e) {
                System.out.print("Please input an integer: ");
                valid = false;
            }
        }

        // Prompt for user choice of algorithm
        System.out.print("What algorithm would you like to run? (type BFS or DFS): ");

        // Get user choice of algorithm
        Scanner userInput = new Scanner(System.in);
        String algChoice = userInput.nextLine();
        while (!Objects.equals(algChoice.toLowerCase(), "bfs") // Check for valid input
                && !Objects.equals(algChoice.toLowerCase(), "dfs")) {
            System.out.print("Please type either BFS or DFS as your choice: ");
            algChoice = userInput.nextLine();
        }

        // Call chosen algorithm
        if (Objects.equals(algChoice.toLowerCase(), "bfs")) {
            BFS alg = new BFS(fQueue, nodeChoice);
            alg.bFSAlgorithm(adjacencyList);
        }
        else {
            DFS alg = new DFS(lQueue, nodeChoice);
            alg.dFSAlgorithm(adjacencyList);
        }

        // Close scanner
        userInput.close();
    }
}
