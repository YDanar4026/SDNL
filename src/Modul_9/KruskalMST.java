/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KruskalMST {

    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        ArrayList<Edge> allEdges = new ArrayList<>();

        Graph(int vertices) {
            this.vertices = vertices;
        }

        public void addEdge(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            allEdges.add(edge); //add to total edges
        }
        
        public void kruskalMST(){
            PriorityQueue<Edge> pq = new PriorityQueue<>(allEdges.size(), Comparator.comparingInt(o -> o.weight));

            //add all the edges to priority queue, //sort the edges on weights
            for (int i = 0; i <allEdges.size() ; i++) {
                pq.add(allEdges.get(i));
            }

            //create a parent []
            int [] parent = new int[vertices];

            //makeset
            makeSet(parent);

            ArrayList<Edge> mst = new ArrayList<>();

            //process vertices - 1 edges
            int index = 0;
            while(index<vertices-1){
                Edge edge = pq.remove();
                //check if adding this edge creates a cycle
                int x_set = find(parent, edge.source);
                int y_set = find(parent, edge.destination);

                if(x_set==y_set){
                    //ignore, will create cycle
                }else {
                    //add it to our final result
                    mst.add(edge);
                    index++;
                    union(parent,x_set,y_set);
                }
            }
            //print MST
            System.out.println("Minimum Spanning Tree: ");
            printGraph(mst);
            
            int totalWeight = printGraph(mst);
    System.out.println("Total Bobot Minimum MST: " + totalWeight);
        }

        public void makeSet(int [] parent){
            //Make set- creating a new element with a parent pointer to itself.
            for (int i = 0; i <vertices ; i++) {
                parent[i] = i;
            }
        }

        public int find(int [] parent, int vertex){
            //chain of parent pointers from x upwards through the tree
            // until an element is reached whose parent is itself
            if(parent[vertex]!=vertex)
                return find(parent, parent[vertex]);;
            return vertex;
        }

        public void union(int [] parent, int x, int y){
            int x_set_parent = find(parent, x);
            int y_set_parent = find(parent, y);
            //make x as parent of y
            parent[y_set_parent] = x_set_parent;
        }

        public int printGraph(ArrayList<Edge> edgeList) {
        int totalWeight = 0;
        for (int i = 0; i < edgeList.size(); i++) {
        Edge edge = edgeList.get(i);
        System.out.println("Edge-" + i + " source: " + edge.source +
                " destination: " + edge.destination +
                " weight: " + edge.weight);
        totalWeight += edge.weight;
        }
        return totalWeight;
        }
    }
    
    public static void main(String[] args) {
        int vertices = 10;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 4, 9);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 0, 5);
        graph.addEdge(2, 3, 4);
        graph.addEdge(2, 5, 7);
        graph.addEdge(3, 1, 4);
        graph.addEdge(3, 2, 4);
        graph.addEdge(3, 4, 8);
        graph.addEdge(3, 5, 6);
        graph.addEdge(4, 1, 9);
        graph.addEdge(4, 3, 8);
        graph.addEdge(4, 5, 10);
        graph.addEdge(4, 6, 10);
        graph.addEdge(4, 7, 8);
        graph.addEdge(4, 8, 9);
        graph.addEdge(5, 1, 7);
        graph.addEdge(5, 3, 6);
        graph.addEdge(5, 4, 10);
        graph.addEdge(5, 6, 3);
        graph.addEdge(6, 5, 3);
        graph.addEdge(6, 4, 10);
        graph.addEdge(6, 7, 6);
        graph.addEdge(6, 9, 7);
        graph.addEdge(7, 4, 8);
        graph.addEdge(7, 6, 6);
        graph.addEdge(7, 8, 4);
        graph.addEdge(7, 9, 6);
        graph.addEdge(8, 5, 9);
        graph.addEdge(8, 7, 4);
        graph.addEdge(8, 9, 7);
        graph.addEdge(9, 6, 7);
        graph.addEdge(9, 7, 6);
        graph.addEdge(9, 8, 7);
        graph.kruskalMST();
    }
}
