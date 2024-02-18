/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

public class Graph {
    
    private int maxVertices;
    private int nVerts;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;

    public Graph(int maxVertices) {
        this.maxVertices = maxVertices;
        this.nVerts = 0;
        this.vertexList = new Vertex[maxVertices];
        this.adjacencyMatrix = new int[maxVertices][maxVertices];
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        if (nVerts < maxVertices) {
            vertexList[nVerts] = new Vertex(label);
            nVerts++;
        } else {
            System.out.println("Graf penuh, tidak bisa menambahkan vertex lebih banyak.");
        }
    }

    public void addEdge(int start, int end) {
        if (start >= 0 && start < nVerts && end >= 0 && end < nVerts) {
            adjacencyMatrix[start][end] = 1;
            adjacencyMatrix[end][start] = 1;
        } else {
            System.out.println("Indeks vertex tidak valid.");
        }
    }

    public void displayVertex(int vertexIndex) {
        if (vertexIndex >= 0 && vertexIndex < nVerts) {
            System.out.println(vertexList[vertexIndex].label);
        } else {
            System.out.println("Indeks vertex tidak valid.");
        }
    }

    public void tampilMatrik() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getnVerts() {
        return nVerts;
    }
    
}
