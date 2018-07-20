package DataStructure.core;

public class QueueTest {

	public static void main(String args[])
	{
		CustomQueue cq = new CustomQueue();
		cq.enqueue(8);
		cq.enqueue(3);
		cq.enqueue(5);
		cq.enqueue(1);
		cq.print();
		cq.dequeue();
		//System.out.println(cq.size());
		cq.dequeue();
		//System.out.println(cq.size());
		cq.dequeue();
		//System.out.println(cq.size());
		cq.dequeue();
		//System.out.println(" ");
		cq.print();
	}
}
