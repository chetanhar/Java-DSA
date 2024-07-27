package Stack_Queue;

import java.util.EmptyStackException;

public class CustomStack {

    protected int[] data;
    protected static final int default_size=10;

    int ptr=-1;
    public CustomStack(){
        this(default_size);
    }
    public CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("STACK IS FULL!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return data[ptr--];
    }
    public int peek() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return data[ptr];
    }

    boolean isFull() {
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

}
