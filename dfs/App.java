package com.bayareala8s.dfs;

import com.bayareala8s.dfs.DirectedGraph;

public class App {

    public static void main(String[] args) {
        DirectedGraph dg = new DirectedGraph();
        dg.insertVertex("Zero");
        dg.insertVertex("One");
        dg.insertVertex("Two");
        dg.insertVertex("Three");
        dg.insertVertex("Four");
        dg.insertVertex("Five");
        dg.insertVertex("Six");
        dg.insertVertex("Seven");
        dg.insertVertex("Eight");
        dg.insertVertex("Nine");
        dg.insertVertex("Ten");
        dg.insertVertex("Eleven");


        dg.insertEdge("Zero","One");
        dg.insertEdge("Zero","Three");
        dg.insertEdge("One","Two");
        dg.insertEdge("One","Four");
        dg.insertEdge("One","Five");
        dg.insertEdge("Two","Five");
        dg.insertEdge("Two","Seven");
        dg.insertEdge("Three","Six");
        dg.insertEdge("Four","Three");
        dg.insertEdge("Five","Three");
        dg.insertEdge("Five","Six");
        dg.insertEdge("Five","Eight");
        dg.insertEdge("Seven","Eight");
        dg.insertEdge("Seven","Ten");
        dg.insertEdge("Eight","Eleven");
        dg.insertEdge("Eleven","Nine");

        dg.display();
        System.out.println("Vertices = " + dg.vertices()+ ", Edges = " + dg.edges());

        dg.dfsTraversal();
        dg.dfsTraversal_All();
    }
}
