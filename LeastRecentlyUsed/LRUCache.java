package com.bayareala8s.LeastRecentlyUsed;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int actualSize;
    private Map<Integer,Node> map;
    private DoubleLinkedList doubleLinkedList;

    public LRUCache() {
        this.map = new HashMap<>();
        this.doubleLinkedList = new DoubleLinkedList();
    }

    public void put(int id, String data) {

        //update the node if already exists
        if(map.containsKey(id)) {
            Node node = this.map.get(id);
            node.setInfo(data);

            //update the node to be the head (cache feature)
            doubleLinkedList.deleteNode(node.info);
            doubleLinkedList.insertInBeginning(node.getId(),node.getInfo());

            //we have to update the map with the node !!!
            map.put(node.getId(), node);
            return;
        }

        //the data is not present in the cache so insert
        Node node = new Node(id, data);

        //we have to insert into the cache + set it to be the head node
        if(actualSize < Constants.CAPACITY) {
            actualSize++;

            doubleLinkedList.insertInBeginning(node.getId(),node.getInfo());

            //we have to update the map with the node !!!
            map.put(node.getId(), node);
        }
        else {
            //or the cache is full: we have to remove the last item + insert the new one
            doubleLinkedList.deleteLastNode();
            doubleLinkedList.insertInBeginning(node.getId(),node.getInfo());
            //we have to update the map with the node !!!
            map.put(node.getId(), node);
        }
    }

    //get the item with ID id + move to the head because we use this item
    public Node get(int id) {

        //the map does not contain the item [O(1) running time!!!]
        if(!this.map.containsKey(id))
            return null;

        //the map contains the item
        Node node = this.map.get(id);
        //move to the head (frequently visited items must be close to the head)
        //we have to move the node to the front
        doubleLinkedList.deleteNode(node.info);
        doubleLinkedList.insertInBeginning(node.getId(),node.getInfo());
        //we have to update the map with the node !!!
        map.put(node.getId(), node);
        return node;
    }

    public void show() {

        doubleLinkedList.displayList();
    }
}
