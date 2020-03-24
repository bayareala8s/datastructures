package com.bayareala8s.DirectedGraph;

import java.util.Scanner;

public class AppMenuDriven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DirectedGraph graph = new DirectedGraph();

        int choice;
        String s1, s2;

        while(true) {

            System.out.println("1. Display Adjacency Matrix");
            System.out.println("2. Insert a vertex");
            System.out.println("3. Insert an edge");
            System.out.println("4. Delete an edge");
            System.out.println("5. Display Indegree and Outdegree of a vertex");
            System.out.println("6. Check if there is an edge between two vertices");
            System.out.println("7. Exit");
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            switch(choice) {

                case 1:
                    graph.display();
                    System.out.println("Vertices = " + graph.vertices() + ", Edges = " + graph.edges());
                    break;

                case 2:
                    System.out.print("Insert a vertex : ");
                    s1 = scan.next();
                    graph.insertVertex(s1);
                    break;

                case 3:
                    System.out.print("Enter start and end vertices : ");
                    s1 = scan.next();
                    s2 = scan.next();
                    graph.insertEdge(s1, s2);
                    break;

                case 4:
                    System.out.print("Enter start and end vertices : ");
                    s1 = scan.next();
                    s2 = scan.next();
                    graph.deleteEdge(s1,s2);
                    break;

                    case 5:
                        System.out.print("Enter a vertex : ");
                        s1 = scan.next();
                        System.out.println("Indegree is : " + graph.indegree(s1));
                        System.out.println("Outdegree is : " + graph.outdegree(s1));
                        break;

                case 6:
                    System.out.print("Enter two vertices : ");
                    s1 = scan.next();
                    s2 = scan.next();

                    if(graph.edgeExists(s1,s2))
                        System.out.println("There is an edge from " + s1 + " to " + s2);
                    else
                        System.out.println("There is an no edge from " + s1 + " to " + s2);

                    if(graph.edgeExists(s2,s1))
                        System.out.println("There is an edge from " + s2 + " to " + s1);
                    else
                        System.out.println("There is an no edge from " + s2 + " to " + s1);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
