/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

public class Main {

    public static void main(String[] args) {
        Graph theGraph = new Graph(9);
        theGraph.addVertex("A"); // 0
        theGraph.addVertex("B"); // 1
        theGraph.addVertex("C"); // 2
        theGraph.addVertex("D"); // 3
        theGraph.addVertex("E"); // 4
        theGraph.addVertex("F"); // 5
        theGraph.addVertex("G"); // 6
        theGraph.addVertex("H"); // 7
        theGraph.addVertex("I"); // 8

        theGraph.addEdge(0, 1); // A - B
        theGraph.addEdge(0, 8); // A - I
        theGraph.addEdge(0, 5); // A - F
        theGraph.addEdge(1, 2); // B - C
        theGraph.addEdge(1, 4); // B - E
        theGraph.addEdge(1, 0); // B - A
        theGraph.addEdge(2, 3); // C - D
        theGraph.addEdge(2, 4); // C - E
        theGraph.addEdge(2, 1); // C - B
        theGraph.addEdge(3, 2); // D - C
        theGraph.addEdge(3, 6); // D - G
        theGraph.addEdge(3, 7); // D - H
        theGraph.addEdge(4, 1); // E - B
        theGraph.addEdge(4, 2); // E - C
        theGraph.addEdge(4, 6); // E - G
        theGraph.addEdge(5, 0); // F - A
        theGraph.addEdge(5, 6); // F - G
        theGraph.addEdge(6, 5); // G - F
        theGraph.addEdge(6, 4); // G - E
        theGraph.addEdge(6, 3); // G - D
        theGraph.addEdge(7, 3); // H - D
        theGraph.addEdge(8, 0); // I - A

        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < theGraph.getnVerts(); i++)
            theGraph.displayVertex(i);
            System.out.println(" ");
        
        System.out.println("Matrik adjacency:");
        theGraph.tampilMatrik();
        System.out.println("");

        theGraph.dfs();
        System.out.println("");

        theGraph.bfs();
        
    }
}
