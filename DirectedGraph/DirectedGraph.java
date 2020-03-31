package com.bayareala8s.DirectedGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DirectedGraph {
    public final int MAX_VERTICES = 30;

    int n; //no of vertices in graph
    int e; //no of edges in graph
    boolean [][] adj;
    Vertex[] vertexList;

    //constants for different states of a vertex
    private static final int INITIAL = 0;
    private static final int WAITING = 1;
    private static final int VISITED = 2;

    public DirectedGraph() {
        adj = new boolean[MAX_VERTICES][MAX_VERTICES];
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
                if(adj[i][j])
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
        return adj[u][v];
    }

    /*Insert an edge (s1, s2) */
    public void insertEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);
        if(u == v)
            throw new IllegalArgumentException("Not a valid edge");
        if(adj[u][v] == true)
            System.out.print("Edge already present");
        else {
            adj[u][v] = true;
            e++;
        }
    }

    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if(adj[u][v] == false)
            System.out.println("Edge not present in the graph");
        else {
            adj[u][v] = false;
            e--;
        }
    }

    /* Returns number of adges going out from a vertex */
    public int outdegree(String s) {
        int u = getIndex(s);

        int out = 0;
        for(int v=0; v<n; v++)
            if(adj[u][v])
                out++;

        return out;
    }

    /* Returns number of edges coming to a vertex */
    public int indegree(String s) {
        int u = getIndex(s);

        int in = 0;
        for(int v = 0; v < n; v++)
            if(adj[v][u])
                in++;
        return in;
    }

    public void bfsTraversal() {

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
        qu.add(v);
        vertexList[v].state = WAITING;

        while(!qu.isEmpty()) {

            v = qu.remove();
            System.out.print(vertexList[v] + " ");
            vertexList[v].state = VISITED;

            for(int i = 0; i < n; i++) {
                if(isAdjacent(v,i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING;
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
                bfs(v);
        }
    }

}
