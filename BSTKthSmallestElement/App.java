package com.bayareala8s.BSTKthSmallestElement;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int choice, x;

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("1. Display Tree");
            System.out.println("2. Search");
            System.out.println("3. Insert a new node");
            System.out.println("4. Delete a node");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Inorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("8. Height of tree");
            System.out.println("9. Find Minimum key");
            System.out.println("10. Find Maximum Key");
            System.out.println("11. Size of tree");
            System.out.println("12. kth position for smallest element");
            System.out.println("13. Quit");
            System.out.println("Enter your choice: ");

            choice = scan.nextInt();

            if (choice == 13)
                break;

            switch (choice) {

                case 1:
                    bst.display();
                    break;
                case 2:
                    System.out.println("Enter the key to be searched: ");
                    x = scan.nextInt();
                    if (bst.search(x))
                        System.out.println("Key found");
                    else
                        System.out.println("Key not found");
                    break;
                case 3:
                    System.out.println("Enter the key to be inserted: ");
                    x = scan.nextInt();
                    //bst.insertIterative(x);
                    bst.insert(x);
                    break;
                case 4:
                    System.out.println("Enter the key to be deleted: ");
                    x = scan.nextInt();
                    //bst.delete(x);
                case 5:
                    bst.preOrder();
                    break;
                case 6:
                    bst.inOrder();
                    break;
                case 7:
                    bst.postOrder();
                    break;
                case 8:
                    System.out.println("Height of tree is " + bst.height());
                    break;
                case 9:
                    try {
                        System.out.println("Minimum key is " + bst.min());
                    }
                    catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Maximum key is " + bst.max());
                    }
                    catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 11:
                    System.out.println("Size of tree is " + bst.size());
                    break;
                case 12:
                    System.out.println("Enter the kth position for smallest element");
                    int k = scan.nextInt();
                    System.out.println("Smallest element of tree at position " + k + " : " + bst.getKthSmallestElement(k));
                    break;

            }
        }
    }
}

/*
/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=56865:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/tools.jar:/Users/himanshu/Downloads/twilio-7.0.0.jar:/Users/himanshu/bayareala8s/out/production/bayareala8s com.bayareala8s.BSTKthSmallestElement.App
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
3
Enter the key to be inserted:
20
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
3
Enter the key to be inserted:
40
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
3
Enter the key to be inserted:
90
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
3
Enter the key to be inserted:
60
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
1

          90
               60
     40
20
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
3
Enter the key to be inserted:
10
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
1

          90
               60
     40
20
     10
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
12
Enter the kth position for smallest element
2
Smallest element of tree at position 2 : 20
1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:
6
10 20 40 60 90 1. Display Tree
2. Search
3. Insert a new node
4. Delete a node
5. Preorder Traversal
6. Inorder Traversal
7. Postorder Traversal
8. Height of tree
9. Find Minimum key
10. Find Maximum Key
11. Size of tree
12. kth position for smallest element
13. Quit
Enter your choice:

 */

