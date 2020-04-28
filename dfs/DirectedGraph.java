package com.bayareala8s.dfs;

import com.bayareala8s.dfs.Vertex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class DirectedGraph {
    public final int MAX_VERTICES = 30;

    int n; //no of vertices in graph
    int e; //no of edges in graph
    boolean [][] adjacencyMatrix;
    Vertex[] vertexList;

    //constants for different states of a vertex
    private static final int INITIAL = 0; //Initially all vertices will be in INITIAL state
    private static final int VISITED = 1; //When a vertex is visited state will be change to INITIAL -> VISITED

    public DirectedGraph() {
        adjacencyMatrix = new boolean[MAX_VERTICES][MAX_VERTICES];
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
                if(adjacencyMatrix[i][j])
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            System.out.println();
        }
    }

    public void insertVertex(String name) {
        vertexList[n++] = new Vertex(name);
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
            e++;
        }
    }

    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if(adjacencyMatrix[u][v] == false)
            System.out.println("Edge not present in the graph");
        else {
            adjacencyMatrix[u][v] = false;
            e--;
        }
    }

    /* Returns number of edges going out from a vertex */
    public int outdegree(String s) {
        int u = getIndex(s);

        int out = 0;
        for(int v=0; v<n; v++)
            if(adjacencyMatrix[u][v])
                out++;

        return out;
    }

    /* Returns number of edges coming to a vertex */
    public int indegree(String s) {
        int u = getIndex(s);

        int in = 0;
        for(int v = 0; v < n; v++)
            if(adjacencyMatrix[v][u])
                in++;
        return in;
    }

    public void dfsTraversal() {

        for(int v = 0; v < n; v++) {

            vertexList[v].state = INITIAL; //state of all vertices is INITIAL
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search");

        String s = scan.next();
        dfs(getIndex(s));

    }

    //1. Visit all vertices in any path starting from start vertex
    //2. Dead end - Vertex with no unvisited adjacent vertices
    private void dfs(int v) {

        Stack<Integer> st = new Stack<Integer>(); //Intially all vertices are in INITIAL state and stack is empty
        st.push(v); //Push start vertex on the stack

        while (!st.isEmpty()) {

            v = st.pop();
            if (vertexList[v].state == INITIAL) {

                System.out.print(vertexList[v] + " "); //visit and change state to visited
                vertexList[v].state = VISITED;
            }
            for (int i = n - 1; i >= 0; i--) {  //Push all those adjacent vertices of v which have not been visited

                if (isAdjacent(v, i) && vertexList[i].state == INITIAL)
                    st.push(i);
            }
        }
        System.out.println();
    }

    public void dfsTraversal_All() {
        int v;
        for(v = 0; v < n; v++)
            vertexList[v].state = INITIAL;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search");

        String s = scan.next();
        dfs(getIndex(s));

        for(v=0; v<n; v++) {
            if(vertexList[v].state == INITIAL)
                dfs(v);
        }
    }

}
