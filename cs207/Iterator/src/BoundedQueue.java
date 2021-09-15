import java.util.Iterator;
import java.util.List;

public class BoundedQueue<T> implements Iterable{

    T[] Ts;
    int size=0;
    //T[] Ts = (T[]) new Object[1];
    public BoundedQueue(int capacity){
        Ts = (T[]) new Object[capacity];
    }
    public BoundedQueue(int capacity, List<T> items){
        Ts = (T[]) new Object[capacity];
        for(int i=0; i<capacity;i++){
            Ts[i] = items.get(i);
        }
        size = items.size();
    }

    public void add(T item){
        Ts[size++] = item;
    }
    public T remove(){
        T removed = Ts[0];
        for(int i=0;i<size;i++){
            Ts[i] = Ts[i+1];
        }
        return removed;

    }
    public T peek(){
        T peeked = Ts[0];
        return peeked;
    }

    @Override
    public Iterator iterator() {
        return new BoundedQueueIterator();
    }

    private class BoundedQueueIterator implements Iterator{
        int currentindex =0;
        @Override
        public boolean hasNext() {
            if(currentindex<=size && Ts[currentindex]!=null)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return Ts[currentindex++];
        }
    }

}