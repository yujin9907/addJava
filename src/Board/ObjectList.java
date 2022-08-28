package Board;

// 배열의 삽입 삭제를 구현한 것

public class ObjectList {
    private static final int defualt_capacity = 10;
    private int size;
    private Object[] elementData;

    public ObjectList() {
        elementData = new Object[defualt_capacity];
    }

    public ObjectList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public void add(Object e){
        if(size == elementData.length){
            grow();
        }
        elementData[size++] = e;
    }
    public Object[] toArray() {
        Object[] arr = new Object[size];
        for(int i=0;i<arr.length;i++){
            arr[i]= elementData[i];
        }
        return arr;
    }
    public Object get(int index){
        if(index<0 || index>=size){
            return null;
        }
        return elementData[index];
    }

    public boolean remove(int index) {
        if(index<0 || index>=size){
            return false;
        }
        for(int i=index+1;i<size;i++){
            elementData[i-1]=elementData[i];
        }
        elementData[--size] = null;
        return true;
    }
    public int size(){
        return size;
    }

    // ADD에 쓰이는 private 메서드(근데 왜 private이고 왜 굳이 따로 뺌?
    private void grow() {
        int newSize = elementData.length + (elementData.length>>1);
        Object[] newArray = new Object[newSize];
        for (int i=0;i< elementData.length; i++){
            newArray[i] = elementData[i];
        }
        elementData = newArray;
    }
}
