package com.bayareala8s.RouteBetweenNodes;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Adjacency matrix representation of an unweighted directed graph
public class DirectedGraph {
    public final int MAX_VERTICES = 30;

    int n; //no of vertices in graph
    int e; //no of edges in graph
    boolean [][] adjacencyMatrix; //2-D array for adjacency matrix in graph. true for 1 & false for 0
    Vertex[] vertexList; // Stores all the vertices of graph

    //constants for different states of a vertex used for BFS Traversal
    private static final int INITIAL = 0; //All vertices in initial state. //Queue is empty
    private static final int WAITING = 1; //Vertex is inserted in the queue
    private static final int VISITED = 2; //Vertex is visited

    public DirectedGraph() {

        adjacencyMatrix = new boolean[MAX_VERTICES][MAX_VERTICES]; //all the elements are set to false
        vertexList = new Vertex[MAX_VERTICES];
        // By default n=0, e=0
        // By default adj[u][v] = false

    }

    public int vertices() {

        //returns total number of vertices in a graph
        return n;
    }

    public int edges() {

        //returns total number of edges in a graph
        return e;
    }

    //Print 2-D array row by row
    public void display() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                if(adjacencyMatrix[i][j])
                    System.out.print("1 "); //for elements which are true print 1
                else
                    System.out.print("0 "); //for elements which are false print 0
            System.out.println();
        }
    }

    public void insertVertex(String name) {
        vertexList[n++] = new Vertex(name); //Increment total count of Vertices
    }


    private int getIndex(String s) {
        for(int i = 0; i < n; i++)
            if(s.equals(vertexList[i].name))
                return i;
        throw new RuntimeException("Invalid Vertex");
    }

    /* Returns true if edge (s1,s2) exists */
    public boolean edgeExists(String s1, String s2) {
        return isAdjacent(getIndex(s1), getIndex(s2));
    }

    private boolean isAdjacent(int u, int v) {
        return adjacencyMatrix[u][v];
    }

    /*Insert an edge (s1, s2) */
    public void insertEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);
        if(u == v)
            throw new IllegalArgumentException("Not a valid edge");
        if(adjacencyMatrix[u][v] == true)
            System.out.print("Edge already present");
        else {
            adjacencyMatrix[u][v] = true;
            e++; //increment total count of edges
        }
    }

    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if(adjacencyMatrix[u][v] == false)
            System.out.println("Edge not present in the graph");
        else {
            adjacencyMatrix[u][v] = false;
            e--; //decrement count of Vertices
        }
    }

    /* Returns number of edges going out from a vertex - row addition of all true */
    public int outdegree(String s) {
        int u = getIndex(s);

        int out = 0;
        for(int v=0; v<n; v++)
            if(adjacencyMatrix[u][v])
                out++;

        return out;
    }

    /* Returns number of edges coming to a vertex - column addition of all true */
    public int indegree(String s) {
        int u = getIndex(s);

        int in = 0;
        for(int v = 0; v < n; v++)
            if(adjacencyMatrix[v][u])
                in++;
        return in;
    }

    // Start vertex is visited, then all vertices adjacent to start vertex are visited
    // Take these adjacent vertices one by one and visit their adjacent vertices
    public void bfsTraversal() {

        //All vertices to state INITIAL
        for(int v = 0; v < n; v++) {

            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Breadth First Search");

        String s = scan.next();
        bfs(getIndex(s));

    }

    private void bfs(int v) {

        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(v); //Insert start Vertex in the Queue
        vertexList[v].state = WAITING; // Change state from INITIAL -> WAITING

        while(!qu.isEmpty()) {

            v = qu.remove(); //Front element of queue is deleted and visited
            System.out.print(vertexList[v] + " ");
            vertexList[v].state = VISITED; // Change state from WAITING -> VISITED

            //insert into queue all the ADJACENT VERTICES who are in initial state
            for(int i = 0; i < n; i++) {
                if(isAdjacent(v,i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING; // Change state from INITIAL -> WAITING
                }
            }
        }

        System.out.println();

    }

    public void bfsTraversal_All() {
        int v;
        for(v = 0; v < n; v++)
            vertexList[v].state = INITIAL;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Breadth First Search");

        String s = scan.next();
        bfs(getIndex(s));

        for(v=0; v<n; v++) {
            if(vertexList[v].state == INITIAL)
                bfs(v); //once this loop is finished all the vertices will be in visited state
        }
    }

}
