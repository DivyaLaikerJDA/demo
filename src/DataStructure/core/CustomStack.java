package DataStructure.core;



public class CustomStack<T> {

	customLinkedList<T> list = new customLinkedList<>();
	
	public void push(T item)
	{
		list.add(item);
	}
	public void print()
	{
		list.print();
	}
	
	public T pop()
	{
		
		return (T) list.pop(1);
	}
	public boolean isEmpty()
	{ if(list.isEmpty())
		return true;
	else
		return false;
		
	}
	public int size()
	{
		int size = list.size();
		return size;
	}
	public T peak()
	{
		T val;
		val = (T) list.head.data;
		return val;
	}
}
