package com.bayareala8s.Hashing;

public class HashTable {

    private studentRecord[] array;
    private int m; //size of the array or hashtable
    int n; //number of records

    public HashTable() {
        this(11);
    }

    public HashTable(int tableSize) {

        m = tableSize;
        array = new studentRecord[m];
        n = 0;
    }

    int hash(int key) {

        return (key % m); //Hash function to map keys to array indices
    }

    public void insert(studentRecord newRecord) { //Using linear probing technique

        int key = newRecord.getStudentId();
        int h = hash(key); //We find hash value
        int location = h;

        for(int i = 1; i < m; i++) {

            if(array[location] == null || array[location].getStudentId() == -1) {

                array[location] = newRecord;
                n++;
                return;
            }

            if(array[location].getStudentId() == key) //Found the key throw exception
                throw new UnsupportedOperationException("Duplicate key");

            //Next probe location
            location = (h + i) % m;
        }
        System.out.println("Table is full : Record can't be inserted"); //Visited whole table and found any empty location

    }

    public studentRecord search(int key) {

        int h = hash(key);
        int location = h;

        for(int i = 1; i < m ; i++) {

            if(array[location] == null)
                return null;

            if(array[location].getStudentId() == key)
                return array[location];

            location = (h + i) % m; //linear probing. Calculate next probe location
        }
        //Key not found
        return null; //Visited whole table and key not found
    }

    public void DisplayTable() {      //Display HashTable
        for(int i=0; i < m ; i++) {

            System.out.print("[" + i + "] --> ");

            if(array[i] != null && array[i].getStudentId() != -1)
                System.out.println(array[i]);
            else
                System.out.println("___");
        }
    }

    public studentRecord Delete(int key) {

        int h = hash(key);
        int location = h;

        for(int i = 1; i < m ; i++) {

            if(array[location] == null)
                return null;

            if(array[location].getStudentId() == key) {

                studentRecord temp = array[location];
                array[location].setStudentId(-1); // -1 to delete record
                n--;
                return temp;
            }

            location = (h + i) % m;
        }
        return null;
    }
}
