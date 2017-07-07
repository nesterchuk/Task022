import java.util.LinkedList;

public class CustomCollection<E> {
    LinkedList<E> list;
    int sizeList;

    CustomCollection(){
        this.list = new LinkedList<E>();
        this.sizeList = 16;
    }

    CustomCollection(int size){
        if (size<=0) {throw new NotCorrectSizeException();};
        this.list = new LinkedList<E>();
        this.sizeList = size;
    }

    public void push(E newElement){
        if(list.size() == sizeList){list.removeFirst();}
        list.add(newElement);
    }
    public LinkedList<E> getList(){
        return list;
    }
}
