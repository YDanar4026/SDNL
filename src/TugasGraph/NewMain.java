/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasGraph;

/**
 *
 * @author OWNER
 */
public class NewMain {

    public static void main(String[] args) {
        Graph graph = new Graph(3);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "B", 1);
        graph.addEdge("B", "C", 2);
        graph.addEdge("C", "A", 3);

        System.out.println("Weight between A and B: " + graph.getWeight("A", "B"));
        System.out.println("Neighbors of B: " + graph.getNeighbors("B"));
    }
    
}
