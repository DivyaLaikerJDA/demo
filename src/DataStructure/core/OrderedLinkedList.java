package DataStructure.core;

import java.util.Comparator;


public class OrderedLinkedList<T  extends Comparable<T>>  {
	
	Node<T>  head = null;
	public void remove(T  item)
	{   if(head.data.equals(item))
	{
		head = head.next;
		return;
	}
		Node<T> ptr =head;
		Node<T> prev = null;
		while(!ptr.data.equals(item)  && ptr != null)
		{ prev = ptr;
			ptr = ptr.next;
		}
		prev.next = ptr.next;
		
		
	}
	
	public int index(T  item)
	{ 
		int ind = -1 ;
	
		if(head.data == item)
			return 0;
		else
		{
			Node<T> ptr = head;
			while(ptr != null)
			{
				if(ptr.data != item){
		         ptr = ptr.next;
				ind++;
			}
			}
			
			 return ind;
		}
	}

public void add(T item)
{  
	Node<T> nptr = new Node(item);
	Node<T> ptr = head,prev = null;
if(head == null)
{  
	head = nptr;
	return;
	}
if(head.next == null && (compare(head.data,nptr.data)>0 || compare(head.data,nptr.data)<0) ){
	
if(compare(head.data,nptr.data)>0)
{
	nptr.next = head;
	head = nptr;
	return;
	}
else
{
	head.next = nptr;
	head = nptr;
	return;
	}
  
}
else
{

	while(compare(nptr.data,ptr.data)>0 && ptr.next !=null)
	{
		prev = ptr;
		ptr = ptr.next;
	}
	nptr.next = ptr.next;
	ptr.next = nptr;
		}
}
	
public void print()
{
Node<T> ptr = head;
if(head == null)
	return;
while(ptr != null){
	System.out.println(ptr.data + " ->");
	ptr = ptr.next;
}

	}
public boolean search(T item)
{
	if(head.data.equals(item))
		return true;
	else
	{
		Node<T> ptr = head;
		while(ptr != null)
		{
			if(ptr.data.equals(item))
				return true;
			
			ptr = ptr.next;
		}
		return false;
	}
}

public T pop(int pos)
{
	pos = pos-1;
	Node<T> prev=null,poped;
	Node<T> ptr = head;
	int k=0;
	while(ptr.next != null && k<pos)
	{ prev = ptr;
	ptr = ptr.next;
		k++;
	}
	poped = ptr;
	prev.next = ptr.next;
	return poped.data;
	
}
public T  pop()
{
	Node<T> ptr = head;
	Node<T> poped = null;
	while(ptr.next.next != null)
	{
		ptr = ptr.next;
	}
	poped = ptr.next;
	ptr.next = null;
	return poped.data;
	
}
public boolean isEmpty()
{ if(head == null)
	return true;
else
	return false;
	}
public int size()
{ 
	int size =0;
	if(head == null)
		return 0;
	else
	{
		Node<T> ptr = head;
		while(ptr != null)
		{
			size++;
			ptr = ptr.next;
		}
		return size;
	}
}
class  Node<T >{
	T data;
	 Node<T> next;
	
	public Node(T a)
	{
		this.data =a;
		next = null;
	}

}
public static <T extends Comparable<T>> int compare(T one, T two){
	return one.compareTo(two);
}



}
