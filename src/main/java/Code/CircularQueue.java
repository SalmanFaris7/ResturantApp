/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class CircularQueue {
    private int maxSize;
    private Order queueArray[];
    private int front;
    private int rear;
    private int nItems;
    
    public CircularQueue(int maxSize)
{
	this.maxSize = maxSize;
	queueArray = new Order[maxSize];
	front = 0;
	rear = -1;
	nItems = 0;
}
public boolean isFull()
{
	return (nItems == maxSize);
}
public void enqueue(Order s) // insert
{
	if(isFull())
	{
		System.out.println("Queue is Full");
	}
	else
	{
		if(rear == maxSize-1){ 
			rear = -1;
		}

		queueArray[++rear] = s;
		nItems++;
	}
}

public boolean isEmpty()
{
	return(nItems == 0);
}
public Order dequeue() // remove 
{
	if(isEmpty())
	{
		return null;
	}
	else
	{
		if(front == maxSize)
		{
			front = 0;
		}
		nItems--;
		return queueArray[front++];
	}
}
public Order peek() 
{
	if(isEmpty())
	{
		return null;
	}
	else
	{
		return queueArray[front];
	}
}

}
