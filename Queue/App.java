package com.bayareala8s.Queue;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int choice, x;
        Scanner scan = new Scanner(System.in);

        QueueA queueA = new QueueA(8);

        while (true) {
            System.out.println("1. Insert an element in the queue");
            System.out.println("2. Delete an element from the queue");
            System.out.println("3. Display element at the front");
            System.out.println("4. Display all elements of the queue");
            System.out.println("5. Display size of the queue");
            System.out.println("6. Quit");

            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if(choice == 6)
                break;

            switch(choice) {

                case 1:
                    System.out.print("Enter the element to be inserted : ");
                    x = scan.nextInt();
                    queueA.enqueue(x);
                    break;

                case 2:
                    x = queueA.dequeue();
                    System.out.println("Element deleted is : " + x);
                    break;

                case 3:
                    System.out.println("Elemnt at the front is : " + queueA.peek());
                    break;

                case 4:
                    queueA.display();
                    break;

                case 5:
                    System.out.println("Size of queue is " + queueA.size());
                    break;

                default:
                    System.out.println("wrong choice");
            }
            System.out.println();
        }
    }
}

/*
/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=60210:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/tools.jar:/Users/himanshu/Downloads/twilio-7.0.0.jar:/Users/himanshu/bayareala8s/out/production/bayareala8s com.bayareala8s.Queue.App
1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 1
Enter the element to be inserted : 10

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 1
Enter the element to be inserted : 20

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 1
Enter the element to be inserted : 30

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 1
Enter the element to be inserted : 40

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 1
Enter the element to be inserted : 50

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 4
Queue is :


10 20 30 40 50

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 3
Elemnt at the front is : 10

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 5
Size of queue is 5

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 2
Element deleted is : 10

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 2
Element deleted is : 20

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 2
Element deleted is : 30

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 2
Element deleted is : 40

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 4
Queue is :


50

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice : 5
Size of queue is 1

1. Insert an element in the queue
2. Delete an element from the queue
3. Display element at the front
4. Display all elements of the queue
5. Display size of the queue
6. Quit
Enter your choice :
 */