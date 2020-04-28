package com.bayareala8s.Hashing;

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


/*
Enter initial size of table : 7
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 1
Enter student id : 20
Enter student name : Himanshu
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 1
Enter student id : 50
Enter student name : John
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 1
Enter student id : 200
Enter student name : Peter
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 4
[0] --> ___
[1] --> 50 John
[2] --> ___
[3] --> ___
[4] --> 200 Peter
[5] --> ___
[6] --> 20 Himanshu
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 2
Enter a key to be searched : 1
Key not found
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 2
Enter a key to be searched : 50
50 John
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 1
Enter student id : 500
Enter student name : Ramesh
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 4
[0] --> ___
[1] --> 50 John
[2] --> ___
[3] --> 500 Ramesh
[4] --> 200 Peter
[5] --> ___
[6] --> 20 Himanshu
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 3
Enter a key to be deleted : 20
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 4
[0] --> ___
[1] --> 50 John
[2] --> ___
[3] --> 500 Ramesh
[4] --> 200 Peter
[5] --> ___
[6] --> ___
1. Insert a record
2. Search a record
3. Delete a record
4. Display a record
5. Exit
Enter your choice : 5
 */