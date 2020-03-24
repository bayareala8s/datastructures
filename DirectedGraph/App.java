package com.bayareala8s.DirectedGraph;

public class App {

    public static void main(String[] args) {
        DirectedGraph dg = new DirectedGraph();
        dg.insertVertex("Zero");
        dg.insertVertex("One");
        dg.insertVertex("Two");

        dg.insertEdge("One","Two");
        dg.insertEdge("Two","Zero");

        dg.display();
        System.out.println("Vertices = " + dg.vertices()+ ", Edges = " + dg.edges());
    }
}
