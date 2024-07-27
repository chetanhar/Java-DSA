package Stack_Queue;

public class CircularQueue {
    private int[] data;
    private int front = -1;
    private int end = -1;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int val) {
        if (front == -1 && end == -1) {
            front = 0;
            end = 0;
            data[end] = val;
        } else if ((end + 1) % data.length == front) {
            System.out.println("queue is full");
        } else {
            end = (end + 1) % data.length;
            data[end] = val;
        }
    }
    public boolean isFull(){
        return (end + 1) % data.length == front;
    }
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    private boolean isEmpty() {
        return front==-1&&end==-1;
    }

    public void display() {
        int i = front;
        while (i != end+1){
            System.out.print(data[i] + " -> ");
            i++;
        }
        System.out.println("END");
    }
}



