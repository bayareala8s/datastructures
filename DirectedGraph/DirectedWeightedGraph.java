package com.bayareala8s.DirectedGraph;

public class DirectedWeightedGraph {

    public final int MAX_VERTICES = 30;

    int n; //no of vertices in graph
    int e; //no of edges in graph
    int [][] adj; //to add weights to the graph
    Vertex[] vertexList;

    public DirectedWeightedGraph() {
        adj = new int[MAX_VERTICES][MAX_VERTICES];
        vertexList = new Vertex[MAX_VERTICES];
        // By default n=0, e=0
        // By default adj[u][v] = false

    }

    public int vertices() {
        return n;
    }

    public int edges() {
        return e;
    }

    public void display() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)

                System.out.print(adj[i][j] + " ");

            System.out.println();
        }
    }

    public void insertVertex(String name) {
        vertexList[n++] = new Vertex(name);
    }

    private int getVertexIndex(String s) {
        for(int i = 0; i < n; i++)
            if(s.equals(vertexList[i].name))
                return i;
        throw new RuntimeException("Invalid Vertex");
    }

    /* Returns true if edge (s1,s2) exists */
    public boolean edgeExists(String s1, String s2) {
        return isAdjacent(getVertexIndex(s1), getVertexIndex(s2));
    }

    private boolean isAdjacent(int u, int v) {

        return (adj[u][v] != 0);
    }

    /*Insert an edge (s1, s2) */
    public void insertEdge(String s1, String s2, int wt) {
        int u = getVertexIndex(s1);
        int v = getVertexIndex(s2);

        if(u == v)
            throw new IllegalArgumentException("Not a valid edge");

        if(adj[u][v] != 0)
            System.out.print("Edge already present");
        else {
            adj[u][v] = wt;
            e++;
        }
    }

    public void deleteEdge(String s1, String s2) {
        int u = getVertexIndex(s1);
        int v = getVertexIndex(s2);

        if(adj[u][v] == 0)
            System.out.println("Edge not present in the graph");
        else {
            adj[u][v] = 0;
            e--;
        }
    }

    /* Returns number of edges going out from a vertex */
    public int outdegree(String s) {
        int u = getVertexIndex(s);

        int out = 0;
        for(int v=0; v<n; v++)
            if(adj[u][v] != 0)
                out++;

        return out;
    }

    /* Returns number of edges coming to a vertex */
    public int indegree(String s) {
        int u = getVertexIndex(s);

        int in = 0;
        for(int v = 0; v < n; v++)
            if(adj[v][u] != 0)
                in++;
        return in;
    }
}
