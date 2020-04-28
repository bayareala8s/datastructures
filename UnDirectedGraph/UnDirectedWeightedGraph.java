package com.bayareala8s.UnDirectedGraph;

public class UnDirectedWeightedGraph {

    public final int MAX_VERTICES = 30;

    int n; //no of vertices in graph
    int e; //no of edges in graph
    int [][] adjacencyMatrix;
    Vertex[] vertexList;

    public UnDirectedWeightedGraph() {
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
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
                if(adjacencyMatrix[i][j] != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
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
        return (adjacencyMatrix[u][v] != 0);
    }

    /*Insert an edge (s1, s2) */
    public void insertEdge(String s1, String s2, int wt) {
        int u = getVertexIndex(s1);
        int v = getVertexIndex(s2);
        if(u == v)
            throw new IllegalArgumentException("Not a valid edge");
        if(adjacencyMatrix[u][v] != 0)
            System.out.print("Edge already present");
        else {
            adjacencyMatrix[u][v] = wt; //put weights
            adjacencyMatrix[v][u] = wt; //put weights
            e++;
        }
    }

    public void deleteEdge(String s1, String s2) {
        int u = getVertexIndex(s1);
        int v = getVertexIndex(s2);

        if(adjacencyMatrix[u][v] == 0)
            System.out.println("Edge not present in the graph");
        else {
            adjacencyMatrix[u][v] = 0;
            adjacencyMatrix[v][u] = 0;
            e--;
        }
    }

    public int degree(String s) {
        int u = getVertexIndex(s);

        int deg = 0;
        for(int v = 0; v < n; v++)
            if(adjacencyMatrix[u][v] !=0 )
                deg++;
        return deg;
    }
}
