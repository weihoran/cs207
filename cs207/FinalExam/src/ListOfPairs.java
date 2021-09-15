import java.util.Iterator;

public class ListOfPairs<T> implements Iterable<T> {
    //private List<Pair<T>> contents= new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return new PairListIterator();
    }

    class PairListIterator implements Iterator<T>{
        int currentIndex;
        int pairIndex;

        @Override
        public boolean hasNext() {
            if(currentIndex>=Sizeofcontents)
                return false;
            else
                return true;
        }

        @Override
        public T next() {
            if(pairIndex==0){
                pairIndex=1;
                return get(currentIndex,pairIndex);
            }
            if(pairIndex==1){
                pairIndex=0;
                currentIndex++;
                return get(currentIndex,pairIndex);
            }
        }
    }
}
