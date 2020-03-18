package com.bayareala8s.hashing;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int id, choice;
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter initial size of table : ");
        int size = scan.nextInt();

        HashTable table = new HashTable(size);

        while(true) {

            System.out.println("1. Insert a record");
            System.out.println("2. Search a record");
            System.out.println("3. Delete a record");
            System.out.println("4. Display a record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if(choice == 5)
                break;

            switch (choice) {

                case 1:
                    System.out.print("Enter student id : ");
                    id = scan.nextInt();
                    System.out.print("Enter student name : ");
                    name = scan.next();

                    studentRecord student = new studentRecord(id, name);
                    table.insert(student);
                    break;

                    case 2:
                        System.out.print("Enter a key to be searched : ");
                        id = scan.nextInt();
                        student = table.search(id);
                        if(student == null)
                            System.out.println("Key not found");
                        else
                            System.out.println(student);
                    break;

                    case 3:
                        System.out.print("Enter a key to be deleted : ");
                        id = scan.nextInt();
                        table.Delete(id);
                    break;
                case 4:
                    table.DisplayTable();
                    break;
            }
        }
        scan.close();
    }
}
