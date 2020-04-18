package com.bayareala8s.CompareTrees;

public class App {

    public static void main(String[] args) {

        BinarySearchTree bst1 = new BinarySearchTree();

        bst1.insert(3);
        bst1.insert(1);
        bst1.insert(8);
        bst1.insert(2);
        bst1.insert(6);
        bst1.insert(7);
        bst1.insert(5);

        bst1.display();
        System.out.print("In-Order Traversal for tree1: ");
        bst1.inOrder();


        System.out.println();

        BinarySearchTree bst2 = new BinarySearchTree();

        bst2.insert(3);
        bst2.insert(1);
        bst2.insert(8);
        bst2.insert(2);
        bst2.insert(6);
        bst2.insert(7);
        bst2.insert(5);


        bst2.display();
        System.out.print("In-Order Traversal for tree2: ");
        bst2.inOrder();
        System.out.println();

        if(compareTrees(bst1.root, bst2.root))
            System.out.println("Trees are same");
        else
            System.out.println("Trees are not same");
    }

    public static boolean compareTrees(Node node1, Node node2) {

        //we have to check the base cases (it may be leaf node so we have to use ==)
        if(node1 == null || node2 == null)
            return node1 == node2;

        //if the values within the nodes are not the same we return false (trees are not the same)
        if(node1.info != node2.info)
            return false;

        //the left subtree values AND the right subtree values must match as well !!!
        return compareTrees(node1.lChild, node2.lChild) && compareTrees(node1.rChild, node2.rChild);
    }
}

/*
/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55849:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/tools.jar:/Users/himanshu/Downloads/twilio-7.0.0.jar:/Users/himanshu/bayareala8s/out/production/bayareala8s com.bayareala8s.comparetrees.App

     8
               7
          6
               5
3
          2
     1
In-Order Traversal for tree1: 1 2 3 5 6 7 8

     8
               7
          6
               5
3
          2
     1
In-Order Traversal for tree2: 1 2 3 5 6 7 8
Trees are same

Process finished with exit code 0
 */