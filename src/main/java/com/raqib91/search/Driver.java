package com.raqib91.search;

public class Driver {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('B', 'C');
        graph.addEdge('C', 'D');
        graph.addEdge('B', 'E');
        graph.addEdge('E', 'F');
        graph.addEdge('B', 'G');
        graph.addEdge('G', 'H');
        graph.addEdge('B', 'H');
        graph.addEdge('E', 'H');
        graph.addEdge('C', 'I');
        graph.addEdge('C', 'J');

        System.out.println(graph.BFS('A'));
    }
}
