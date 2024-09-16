package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue {
    public static void method() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("10");
        queue.add("20");
        queue.add("30");
        queue.add("40");
        queue.add("50");
        
      
        System.out.println("head :" + queue.element());
        System.out.println("head :" + queue.peek());
        
     
        System.out.println("iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); 
        }
        
       
        queue.remove();
        queue.poll();
        
       
        System.out.println("after removing two elements:\n");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
    
    public static void DequeMethod() {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("10");
        dq.add("20");
        dq.add("30");
        
       
        for (String s : dq) {
            System.out.println(s);
        }
        
      
        dq.poll();     
        dq.pollFirst();
        dq.pollLast();  
        
      
        System.out.println("after polling last traversal:");
        for (String s : dq) {
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        method();
        DequeMethod();
    }
}
