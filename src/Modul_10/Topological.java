/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_10;

public class Topological {
    
    public static void main(String[] args) {
        Graph g = new Graph(20); 
        g.addVertex("J1");
        g.addVertex("J2");
        g.addVertex("J3");
        g.addVertex("J4");
        g.addVertex("J5");
        g.addVertex("J6");
        g.addVertex("J7");
        
        g.addArrowEdge(0, 1); 
        g.addArrowEdge(0, 2); 
        g.addArrowEdge(1, 3); 
        g.addArrowEdge(1, 4); 
        g.addArrowEdge(1, 5); 
        g.addArrowEdge(2, 3); 
        g.addArrowEdge(3, 4); 
        g.addArrowEdge(4, 6); 
  
        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < g.getnVerts(); i++)
            g.displayVertex(i);
            System.out.println(" ");
        
        System.out.println("Matrik adjacency:");
        g.tampilMatrik();
        
        g.topologicalSort(); 
        System.out.println("");
    } 
}
