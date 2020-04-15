package com.bayareala8s.BinaryTree;
import java.util.NoSuchElementException;

public class QueueA {
	private Node[] queueArray;
	private int front; //index of first element of the queue
	private int rear; //index of last element of the queue

	//1. if front is equal to rear, there is only one element in the queue,
	//except in initially empty queue
	//2. Number of elements is rear-front+1, except in initially empty queue
	//3. Queue is empty: front is -1, front is equal to rear + 1
	//4. Queue is full: rear becomes equal to arraySize - 1
	public QueueA() {
		queueArray = new Node[10];
		front = -1; //Initially empty queue: front and rear will be -1
		rear = -1;
	}

	public QueueA(int maxSize) {
		queueArray = new Node[maxSize]; //size of array
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return (front == -1 || front == rear + 1);
	}

	public boolean isFull() {
		return (rear == queueArray.length - 1);
	}

	public int size() {
		if(isEmpty())
			return 0;
		else
			return rear - front + 1;
	}

	//insert element at rear end of the array
	public void enqueue(Node n) {

		if(isFull()) {
			System.out.println("Queue overflow\n");
			return;
		}
		if(front == -1)
			front = 0;
		rear = rear + 1;
		queueArray[rear] = n;
	}

	public Node dequeue() {
		Node x;
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		x = queueArray[front];
		front = front + 1;
		return x;
	}

	public Node peek() {

		if(isEmpty()) {
			System.out.println("Queue Underflow\n");
			throw new NoSuchElementException();
		}
		return queueArray[front];
	}


	public void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue is empty\n");
			return;
		}

		System.out.println("Queue is :\n\n");
		for(i = front; i <= rear; i++) {
			System.out.print(queueArray[i] + " ");
		}

		System.out.println();
	}
}
