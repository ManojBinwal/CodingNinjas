package Queue;

import java.util.ArrayList;

public class QueueUsingArrayList<T> {
    private ArrayList<T> head = new ArrayList<>();

    public QueueUsingArrayList(T head){
        offer(head);
    }
    public boolean add(T data){
        this.head.add(data);
        return true;
    }
    public boolean offer(T data){
        this.head.add(data);
        return true;
    }

    public T poll(){
        if(this.head.size()==0){
            throw new RuntimeException("cannot remove element from empty queue");
        }
        T element = this.head.get(0);
        this.head.remove(0);
        return element;
    }
    public T peek(){
        if(this.head.size()==0){
            return null;
        }
        return this.head.get(0);
    }
    public int size(){
        return this.head.size();
    }
    public boolean isEmpty(){
        return this.head.size()==0;
    }
}
class QueueUse{
    public static void reverseQueue(QueueUsingArrayList<Integer> input) {
        // If the queue is empty, return immediately
        if (input.size() == 0) return;

        // Remove the first element from the queue
        int element = input.poll();

        // Reverse the queue without the first element
        reverseQueue(input);

        // Add the first element back to the end of the queue
        input.add(element);
    }
    public static void main(String[] args) {
        QueueUsingArrayList<Integer> queue = new QueueUsingArrayList<>(10);
        queue.add(20);
        queue.offer(30);
//        System.out.println(queue.poll());
//        int head =queue.peek();
//        System.out.println(head);
//        int size=queue.size();
//        System.out.println(size);
//        boolean isEmpty=queue.isEmpty();
//        System.out.println(isEmpty);
        reverseQueue(queue);
        System.out.println(queue.peek());
    }
}
