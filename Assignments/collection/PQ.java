package Collection;
{{{{{{{{{{{{{{{{{{{{
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PQ {
	public static void method() {
	PriorityQueue queue=new PriorityQueue();
	queue.add("10");
	queue.add("20");
	queue.add("30");
	queue.add("40");
	queue.add("50");
	System.out.println("head : "+queue.element());
	System.out.println("head : "+queue.peek());
	System.out.println("iterating the queue elements  : ");
	Iterator itr =queue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.hasNext());
	}
	queue.remove();
	queue.poll();
	System.out.println("after removing  two elements : ");
	Iterator<String> itr2 =queue.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.hasNext());
	}

	}
public  static void DequeMethod()
{
	Deque dq=new ArrayDeque();
	dq.add("10");
	dq.add("20");
	dq.add("30");
	for(Object s : dq)
	{
		System.out.println(s);
	}
	dq.poll();
	dq.pollFirst();//same as poll()
	dq.pollLast();
	System.out.println("after polllast traversal");
	for(Object s : dq)
	{
		System.out.println(s);
	}
	
}
	public static void main(String[] args) {
		method();
		DequeMethod();

}
}
