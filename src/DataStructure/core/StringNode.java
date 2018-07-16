package DataStructure.core;

import java.util.Scanner;

class StringNode {
	
	private  String data;
	private  StringNode next;
	
	public StringNode()
	{
		next = null;
		data = "0";
	}
	
	public StringNode(String val,StringNode n)
	{
		data = val;
		next = n;
	}

	public void setLink(StringNode  n)
	{
		next  = n;
	}
	
	public void setData(String d)
	{
		data = d;
	}
	
	public String getData()
	{
		return data;
	}
	
	public StringNode getLink()
	{
		return next;
	}
}
class LinkedList{
	
	public StringNode start;
	public StringNode end;
	int size;
	
	public LinkedList()
	{
		start = null;
		end = null;
		size = 0;
	}
	boolean isEmpty()
	{
		if(start==null)
			return true;
		else
			return false;
	}
	
	int getSize()
	{
		return size;
	}
	
	public void insertAtStart(String val)
	{
		StringNode nptr = new StringNode(val,null);
		size++;
	if(start == null)
	{
		start = nptr;
		end = start;
	}
	else
	{
		nptr.setLink(start);
		start = nptr;
	}
	}
	
	public void insertAtEnd(String val)
	{
		StringNode nptr = new StringNode(val , null);
		size++;
		
		if(start == null)
		{
			start = nptr;
			end = start;
		}
		else
		{
			nptr.setLink(end);
			end = nptr;
		}
	}
	
	public void insertAtPos(String num , int pos )
	{
		StringNode nptr = new StringNode(num, null);
		StringNode ptr = start;
		 pos = pos-1;
		 for(int i=1;i<size;i++)
		 {
			 if( i == pos)
			 {
				 StringNode temp = ptr.getLink();
				 ptr.setLink(nptr);
				 nptr.setLink(temp);

			 break;
			 }
			 ptr = ptr.getLink();
		 }
		 size++;
	}
	
	public void delete(int pos)
	{
		if(pos == 1)
		{
			start = start.getLink();
			size--;
			return ;
		}
		
		if(pos == size)
		{
			StringNode s = start;
			StringNode t = start;
			while(s != end)
			{
				t = s;
				s = s.getLink();
			}
			
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		StringNode ptr;
		ptr = start;
		pos = pos-1;
		for(int i=1;i<size-1;i++)
		{
			if( i == pos)
			{
				StringNode temp = ptr.getLink();
				temp = temp.getLink();
				ptr.setLink(temp);
				break;
			}
			ptr =ptr.getLink();
		}
		size--;
	}
	
	public void display()
	{
		if(size == 0)
		{
			System.out.println("empty linked List");
		}
		if(start.getLink() == null)
		{
			System.out.println(start.getData());
		}
		StringNode ptr = start;
		System.out.print(start.getData()+"->");
		ptr = start.getLink();
		while(ptr.getLink() != null)
		{
			System.out.print(ptr.getData()+"->");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
}

