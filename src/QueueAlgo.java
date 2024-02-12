import java.util.Queue;
import java.util.LinkedList;

public class QueueAlgo {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(30);
        System.out.println(queue);

        int frontElement=queue.poll();
        System.out.println("Front Element is :" + frontElement);


        System.out.println(queue);
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        // traverse queue
        while(!queue.isEmpty()){
            int element=queue.poll();
            System.out.println("Element in queue is :" + element);
        }

        
    }
    public static boolean isEmpty(Queue<?> element){
        return element.isEmpty();

        
    }
}
