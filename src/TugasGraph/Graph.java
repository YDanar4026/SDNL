/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    private int[][] adjacencyMatrix;
    private List<String> labels;

    public Graph(int size) {
        adjacencyMatrix = new int[size][size];
        labels = new ArrayList<>();
    }

    public void addVertex(String label) {
        labels.add(label);
    }

    public void addEdge(String label1, String label2, int weight) {
        int index1 = labels.indexOf(label1);
        int index2 = labels.indexOf(label2);
        adjacencyMatrix[index1][index2] = weight;
        // Uncomment the following line if the graph is undirected
        // adjacencyMatrix[index2][index1] = weight;
    }

    public int getWeight(String label1, String label2) {
        int index1 = labels.indexOf(label1);
        int index2 = labels.indexOf(label2);
        return adjacencyMatrix[index1][index2];
    }

    public List<String> getNeighbors(String label) {
        List<String> neighbors = new ArrayList<>();
        int index = labels.indexOf(label);
        for (int i = 0; i < adjacencyMatrix[index].length; i++) {
            if (adjacencyMatrix[index][i] != 0) {
                neighbors.add(labels.get(i));
            }
        }
        return neighbors;
    }
    
}
