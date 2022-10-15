import java.util.*;
public class Demo{
   public static void main(String args[]){
      PriorityQueue<Integer> my_p_queue = new PriorityQueue<Integer>(Collections.reverseOrder());
      my_p_queue.add(43);
      my_p_queue.add(56);
      my_p_queue.add(99);
      System.out.println("The elements in the priority queue are : ");
      Iterator my_iter = my_p_queue.iterator();
      while (my_iter.hasNext())
      System.out.println(my_iter.next());
      my_p_queue.poll();
      System.out.println("After removing an element using the poll function, the queue elements are :");
      Iterator<Integer> my_iter_2 = my_p_queue.iterator();
      while (my_iter_2.hasNext())
      System.out.println(my_iter_2.next());
      Object[] my_arr = my_p_queue.toArray();
      System.out.println("The array representation of max heap : ");
      for (int i = 0; i < my_arr.length; i++)
      System.out.println("Value: " + my_arr[i].toString());
   }
}
