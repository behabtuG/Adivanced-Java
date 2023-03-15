package DataStructures.Graph;

import java.util.ArrayList;

// Java code to demonstrate Graph representation
// using ArrayList in Java
public class Graph {

    // A utility function to add an edge in an
    // undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
        // for a directed graph with an edge pointing from u to v,
        // adj.get(u).add(v);
    }

    // A utility function to print the adjacency list
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }

    //output:
    //Adjacency list of vertex0
    //head -> 1 -> 4
    //
    //Adjacency list of vertex1
    //head -> 0 -> 2 -> 3 -> 4
    //
    //Adjacency list of vertex2
    //head -> 1 -> 3
    //
    //Adjacency list of vertex3
    //head -> 1 -> 2 -> 4
    //
    //Adjacency list of vertex4
    //head -> 0 -> 1 -> 3
}


