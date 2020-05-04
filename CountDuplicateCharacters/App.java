package com.bayareala8s.CountDuplicateCharacters;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");

        String word = scan.nextLine();

        DuplicateCharacters dup = new DuplicateCharacters();
        HashMap<Character,Integer> dupCount = dup.getDuplicateCharacters(word);

        for(Map.Entry<Character,Integer> entryset: dupCount.entrySet()) {

            System.out.println("Character: " + entryset.getKey() + " has duplicates " + entryset.getValue());
        }

        //First unique character - Position
        for(int i = 0; i < word.length() ; i++) {

            if(dupCount.get(word.charAt(i)) == 1) {

                System.out.println("First unique character is at position : " + i);
                break;
            }
        }

        //sort-characters-by-frequency
        PriorityQueue<Map.Entry<Character,Integer>> priorityQueue = new PriorityQueue<Map.Entry<Character,Integer>>(Collections.reverseOrder(Map.Entry.comparingByValue()));
        priorityQueue.addAll(dupCount.entrySet());

        StringBuilder stringBuilder = new StringBuilder();

        while(!priorityQueue.isEmpty()) {

            Map.Entry<Character,Integer> entrySet = priorityQueue.poll();

            String str = (new String(new char[entrySet.getValue()])).replace("\0",String.valueOf(entrySet.getKey()));

            stringBuilder.append(str);
        }

        System.out.println("Sorted string by frequency : " + stringBuilder.toString());


        //Top K Frequent Elements
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<Map.Entry<Character,Integer>>(Collections.reverseOrder(Map.Entry.comparingByValue()));
        pq.addAll(dupCount.entrySet());

        StringBuilder sb = new StringBuilder();
        int k = 3;
        int count = 0;

        while(!pq.isEmpty()) {

            Map.Entry<Character,Integer> entrySet = pq.poll();

            if( count >= k)
                break;

            sb.append(entrySet.getKey() + " ");
            count++;
        }

        System.out.println("Top K Frequent Elements : " + sb.toString());



    }
}
/*
java
Character: a has duplicates 2
Character: v has duplicates 1
Character: j has duplicates 1
First unique character is at position : 0
 */

/*
Enter word
leetcode
Character: c has duplicates 1
Character: t has duplicates 1
Character: d has duplicates 1
Character: e has duplicates 3
Character: l has duplicates 1
Character: o has duplicates 1
First unique character is at position : 0
 */

/*
Enter word
java
Character: a has duplicates 2
Character: v has duplicates 1
Character: j has duplicates 1
First unique character is at position : 0
Sorted string by frequency : aajv
 */


/*
Enter word
leetcode
Character: c has duplicates 1
Character: t has duplicates 1
Character: d has duplicates 1
Character: e has duplicates 3
Character: l has duplicates 1
Character: o has duplicates 1
First unique character is at position : 0
Sorted string by frequency : eeeoltdc
Top K Frequent Elements : e o l
 */