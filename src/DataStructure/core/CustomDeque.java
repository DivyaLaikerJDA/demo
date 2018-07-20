package DataStructure.core;

public class CustomDeque<T> {
	
	customLinkedList cq = new customLinkedList();
	
	public void addFront(T item)
	{
		cq.add(item);
	}
	public void addRear(T item)
	{
		cq.append(item);
	}
	public T removeFront()
	{
		return (T) cq.pop();
	}
	public T removeRear()
	{
		return (T) cq.pop(1);
	}
	public void print()
	{
		cq.print();
	}
	public boolean isEmpty()
	{
		return cq.isEmpty();
	}
	public int size()
	{
		return cq.size();
	}

}
