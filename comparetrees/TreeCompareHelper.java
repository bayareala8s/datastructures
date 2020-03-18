package com.bayareala8s.comparetrees;

public class TreeCompareHelper {

    public boolean compareTrees(Node node1, Node node2) {

        //we have to check the base cases (it may be leaf node so we have to use ==)
        if(node1==null || node2==null) return node1==node2;

        //if the values within the nodes are not the same we return false (trees are not the same)
        if(node1.info != node2.info)
            return false;

        //the left subtree values AND the right subtree values must match as well !!!
        return compareTrees(node1.lChild, node2.lChild) && compareTrees(node1.rChild, node2.rChild);
    }
}
