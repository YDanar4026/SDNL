/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_7;

public class Main {

    public static void main(String[] args) {
        
        Graph theGraph = new Graph(5);

        theGraph.addVertex("A"); // 0
        theGraph.addVertex("B"); // 1
        theGraph.addVertex("C"); // 2
        theGraph.addVertex("D"); // 3
        theGraph.addVertex("E"); // 4

        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < theGraph.getnVerts(); i++)
            theGraph.displayVertex(i);

        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE

        System.out.println("Matrik adjacency:");
        theGraph.tampilMatrik();
        
    }
}
