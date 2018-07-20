package DataStructure.core;

public class QueueStack<T> {
	
	CustomStack<T> stack1 = new CustomStack<>();
	CustomStack<T> stack2 = new CustomStack<>();
	public void add(T item)
	{
		if(stack2.isEmpty())
			stack1.push(item);
		else
		{
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			stack1.push(item);
		}
	}
	
	public  T pop()
	{
		if(stack1.isEmpty())
			return (T)stack2.pop();
		else
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			return (T)stack2.pop();
		}
			
	}
	public void print()
	{
		if(stack2.isEmpty())
		{
			stack1.print();
			
		}
		else
		{
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			stack1.print();
		}
		
	}

}
