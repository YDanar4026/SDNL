/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    
    private int maxVertices;
    private int nVerts;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private LinkedList<Integer> adj[];

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

    public void addArrowEdge(int start, int end, int weight) {
    if (start >= 0 && start < nVerts && end >= 0 && end < nVerts) {
        adjacencyMatrix[start][end] = weight;
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
    
//    public void dfs() {
//        System.out.println("Depth-First Search (DFS):");
//        if (nVerts > 0) {
//            Stack<Integer> stack = new Stack<>();
//            vertexList[0].visited = true;
//            displayVertex(0);
//            stack.push(0);
//
//            while (!stack.isEmpty()) {
//                int unvisitedVertex = getUnvisitedAdjacentVertex(stack.peek());
//                if (unvisitedVertex == -1) {
//                    stack.pop();
//                } else {
//                    vertexList[unvisitedVertex].visited = true;
//                    displayVertex(unvisitedVertex);
//                    stack.push(unvisitedVertex);
//                }
//            }
//
//            for (int i = 0; i < nVerts; i++) {
//                vertexList[i].visited = false;
//            }
//        }
//    }
//
//    public void bfs() {
//        System.out.println("Breadth-First Search (BFS):");
//        if (nVerts > 0) {
//            Queue<Integer> queue = new LinkedList<>();
//            vertexList[0].visited = true;
//            displayVertex(0);
//            queue.add(0);
//
//            while (!queue.isEmpty()) {
//                int currentVertex = queue.remove();
//                int unvisitedVertex;
//
//                while ((unvisitedVertex = getUnvisitedAdjacentVertex(currentVertex)) != -1) {
//                    vertexList[unvisitedVertex].visited = true;
//                    displayVertex(unvisitedVertex);
//                    queue.add(unvisitedVertex);
//                }
//            }
//
//            for (int i = 0; i < nVerts; i++) {
//                vertexList[i].visited = false;
//            }
//        }
//    }
//
//    private int getUnvisitedAdjacentVertex(int vertexIndex) {
//        for (int i = 0; i < nVerts; i++) {
//            if (adjacencyMatrix[vertexIndex][i] == 1 && !vertexList[i].visited) {
//                return i;
//            }
//        }
//        return -1;
//    }
    
    
    
//    public void topologicalSort() {
//        Stack<Integer> stack = new Stack<>();
//        boolean visited[] = new boolean[nVerts];
//
//        for (int i = 0; i < nVerts; i++)
//            if (!visited[i])
//                topologicalSortUtil(i, visited, stack);
//
//        System.out.println("\nTopological Sort:");
//        while (!stack.isEmpty()) {
//            System.out.print(vertexList[stack.pop()].label +" ");
//        }
//    }
//
//    private void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
//    visited[v] = true;
//    
//        for (int o = 0; o < nVerts; o++) {
//            if (adjacencyMatrix[v] [o] == 1 && !visited[o])
//                topologicalSortUtil(o, visited, stack);
//        }
//    stack.push(v);
//}
    
    public void shortestPath(int startVertex) {
    int[] distance = new int[maxVertices];
    int[] predecessor = new int[maxVertices];
    Arrays.fill(distance, Integer.MAX_VALUE);
    Arrays.fill(predecessor, -1);
    distance[startVertex] = 0;

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(startVertex);

    while (!priorityQueue.isEmpty()) {
        int currentVertex = priorityQueue.poll();

        for (int neighbor : getNeighbors(currentVertex)) {
            int newDistance = distance[currentVertex] + adjacencyMatrix[currentVertex][neighbor];
            if (newDistance < distance[neighbor]) {
                distance[neighbor] = newDistance;
                predecessor[neighbor] = currentVertex;
                priorityQueue.add(neighbor);
            }
        }
    }

    // Tampilkan hasil shortest path
    System.out.println("Shortest Path from vertex " + vertexList[startVertex].label + ":");
    for (int i = 0; i < maxVertices; i++) {
        System.out.print("To " + vertexList[i].label + ": " + distance[i]);
        
        // Tampilkan bobot edge jika ada predecessor
        if (predecessor[i] != -1) {
            System.out.print("   Via " + vertexList[predecessor[i]].label + " with weight: " + adjacencyMatrix[predecessor[i]][i]);
        }
        
        System.out.println();
    }
}

    private Iterable<Integer> getNeighbors(int vertex) {
        LinkedList<Integer> neighbors = new LinkedList<>();
        for (int i = 0; i < maxVertices; i++) {
            if (adjacencyMatrix[vertex][i] != 0) {
                neighbors.add(i);
            }
        }
        return neighbors;
    }

    
}
