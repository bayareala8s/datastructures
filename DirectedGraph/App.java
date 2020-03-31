package com.bayareala8s.DirectedGraph;

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


        dg.insertEdge("Zero","One");
        dg.insertEdge("Zero","Three");
        dg.insertEdge("One","Two");
        dg.insertEdge("One","Four");
        dg.insertEdge("One","Five");
        dg.insertEdge("Two","Three");
        dg.insertEdge("Two","Five");
        dg.insertEdge("Three","Six");
        dg.insertEdge("Four","Five");
        dg.insertEdge("Four","Seven");
        dg.insertEdge("Five","Six");
        dg.insertEdge("Five","Eight");
        dg.insertEdge("Six","Eight");
        dg.insertEdge("Six","Nine");
        dg.insertEdge("Seven","Eight");
        dg.insertEdge("Eight","Nine");

        dg.display();
        System.out.println("Vertices = " + dg.vertices()+ ", Edges = " + dg.edges());

        dg.bfsTraversal();
        dg.bfsTraversal_All();
    }
}
