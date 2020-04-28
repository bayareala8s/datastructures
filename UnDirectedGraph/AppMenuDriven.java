package com.bayareala8s.UnDirectedGraph;

import com.bayareala8s.DirectedGraph.DirectedGraph;

import java.util.Scanner;

public class AppMenuDriven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        UnDirectedGraph graph = new UnDirectedGraph();

        int choice;
        String s1, s2;

        while(true) {

            System.out.println("1. Display Adjacency Matrix");
            System.out.println("2. Insert a vertex");
            System.out.println("3. Insert an edge");
            System.out.println("4. Delete an edge");
            System.out.println("5. Display degree of a vertex");
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
                        System.out.println("degree is : " + graph.degree(s1));
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

/*
/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=52002:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/tools.jar:/Users/himanshu/Downloads/twilio-7.0.0.jar:/Users/himanshu/bayareala8s/out/production/bayareala8s com.bayareala8s.UnDirectedGraph.AppMenuDriven
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 2
Insert a vertex : zero
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 2
Insert a vertex : one
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 2
Insert a vertex : two
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 1
0 0 0
0 0 0
0 0 0
Vertices = 3, Edges = 0
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 3
Enter start and end vertices : zero two
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 1
0 0 1
0 0 0
1 0 0
Vertices = 3, Edges = 1
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 3
Enter start and end vertices : one two
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 1
0 0 1
0 0 1
1 1 0
Vertices = 3, Edges = 2
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice : 5
Enter a vertex : two
degree is : 2
1. Display Adjacency Matrix
2. Insert a vertex
3. Insert an edge
4. Delete an edge
5. Display degree of a vertex
6. Check if there is an edge between two vertices
7. Exit
Enter your choice :
Process finished with exit code 130 (interrupted by signal 2: SIGINT)

 */