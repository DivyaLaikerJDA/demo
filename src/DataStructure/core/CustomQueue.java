package DataStructure.core;

public class CustomQueue<T> {

	customLinkedList list = new customLinkedList();
	
	public void enqueue(T item)
	{
		list.add(item);
	}
	public T dequeue()
	{ T item;
		item = (T) list.pop();
		return item;
	}
	public boolean isEmpty()
	{
		if(list.isEmpty())
			return true;
		else
			return false;
	}
	public int size()
	{
		int size = list.size();
		return size;
	}
	public void print()
	{
    list.print();
	}
}
