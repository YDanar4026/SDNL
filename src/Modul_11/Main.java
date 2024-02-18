/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_11;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("D");
        graph.addVertex("C");
        graph.addVertex("B");
        graph.addVertex("A");

        graph.addArrowEdge(0, 1, 15); // E-F
        graph.addArrowEdge(0, 2, 15); // E-D
        graph.addArrowEdge(1, 2, 10); // F-D
        graph.addArrowEdge(2, 3, 50); // D-C
        graph.addArrowEdge(2, 4, 20); // D-B
        graph.addArrowEdge(3, 4, 5);  // C-B
        graph.addArrowEdge(4, 3, 5);  // B-C
        graph.addArrowEdge(5, 1, 10); // A-F
        graph.addArrowEdge(5, 2, 100);// A-D
        graph.addArrowEdge(5, 3, 30); // A-C
        graph.addArrowEdge(5, 4, 50); // A-B

        graph.shortestPath(0);
        
    }
}
