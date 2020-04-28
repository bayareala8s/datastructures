package com.bayareala8s.DoubleLinkedList;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int choice,x,data;
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.createList();
        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Choices are: ");

            System.out.println("1: Display list");
            System.out.println("2. Insert in empty list");
            System.out.println("3. Insert a Node in beginning of the list");
            System.out.println("4. Insert a Node at the end of the list");
            System.out.println("5. Insert a Node after a specified Node");
            System.out.println("6. Insert a Node before a specified Node");
            System.out.println("7. Delete first Node");
            System.out.println("8. Delete last Node");
            System.out.println("9. Delete any Node");
            System.out.println("10. Reverse the list");
            System.out.println("11. Quit");


            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if(choice == 11)
                break;

            switch(choice) {

                case 1:
                    doubleLinkedList.displayList();
                    break;
                case 2:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleLinkedList.insertInEmptyList(data);
                    break;
                case 3:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleLinkedList.insertInBeginning(data);
                    break;

                case 4:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleLinkedList.insertAtEnd(data);
                    break;
                case 5:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the element after which to insert");
                    x = scan.nextInt();
                    doubleLinkedList.insertAfter(data, x);
                    break;
                case 6:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the element before which to insert");
                    x = scan.nextInt();
                    doubleLinkedList.insertBefore(data, x);
                    break;
                case 7:
                    doubleLinkedList.deleteFirstNode();
                    break;
                case 8:
                    doubleLinkedList.deleteLastNode();
                case 9:
                    System.out.print("Enter the element to be deleted : ");
                    data = scan.nextInt();
                    doubleLinkedList.deleteNode(data);
                    break;
                case 10:
                    doubleLinkedList.reverseList();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of nodes : 6
Enter the first element to be inserted : 25
Enter the next element to be inserted :
30
Enter the next element to be inserted :
10
Enter the next element to be inserted :
50
Enter the next element to be inserted :
90
Enter the next element to be inserted :
20
Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  25 30 10 50 90 20

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 3
Enter the element to be inserted : 2

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  2 25 30 10 50 90 20

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 4
Enter the element to be inserted : 100

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  2 25 30 10 50 90 20 100

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 5
Enter the element to be inserted : 200
Enter the element after which to insert30

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  2 25 30 200 10 50 90 20 100

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 6
Enter the element to be inserted : 300
Enter the element before which to insert20

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  2 25 30 200 10 50 90 300 20 100

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 7

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  25 30 200 10 50 90 300 20 100

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 8
Enter the element to be deleted : 50

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  25 30 200 10 90 300 20

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 10

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 1
List is :  20 300 90 10 200 30 25

Choices are:
1: Display list
2. Insert in empty list
3. Insert a Node in beginning of the list
4. Insert a Node at the end of the list
5. Insert a Node after a specified Node
6. Insert a Node before a specified Node
7. Delete first Node
8. Delete last Node
9. Delete any Node
10. Reverse the list
11. Quit
Enter your choice : 11

Process finished with exit code 0

 */