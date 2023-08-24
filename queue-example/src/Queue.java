public class Queue {

    int capacity;

    int front;

    int rear;

    int [] queue;

    public Queue(int capacity){
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];

    }
    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full, cannot add new element at the end of Queue");
        } else {
            if (front == -1){
                front = 0;

            }
            queue[++rear] = item;
            System.out.println("Element "+ item + " is added to the end of the queue at index "+rear);
            printQueue();
        }
    }

    int dequeue(){
        int removedItem=0;
        if (isEmpty()){
             System.out.println("Queue is already empty, hence cannot remove an item from the queue");

        } else {
            removedItem = queue[front];
            queue [front] = 0;
            if (front == (capacity-1)) {
                front = -1;
                rear = -1;

            }else {
                front++;
            }
            System.out.println("Element "+removedItem + " is removed..");
        }
        return removedItem;

    }

    boolean isFull(){
         return rear == (capacity -1);
    }

    boolean isEmpty() { return front == -1; }

    int peak() {return queue [front]; }

    void printQueue() {
        System.out.println("--------" +
                "Queue content is :" +
                "---------");
        for (int j : queue) {
            System.out.println(j + "\t");

        }
        System.out.println("\n-----------------------");

        }

}


