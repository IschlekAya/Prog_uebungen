public class GenericStack <E> {
    E[] arr;
    int capacity = 0;
    int size;
    public GenericStack(){
        arr = (E[])new Object[1];
        size = 1;
    }
    public void push(E element){
        arr[capacity]=element;
        capacity++;
        if(capacity==size)
        {
            E[] temp = arr;
            arr = (E[])new Object[arr.length*2];
            System.arraycopy(temp, 0, arr, 0, temp.length);
        }
    }
    public E pop(){
        if((size/2)==capacity){
            E[] temp = arr;
            arr = (E[])new Object[arr.length/2];
            System.arraycopy(temp, 0, arr, 0, temp.length);
        }
        capacity -=1;
        return arr[capacity+1];
    }
    public E top(){return arr[capacity];}
    public boolean isEmpty(){return capacity==0;}
    public int size(){return size;}

    public void debug(){
        System.out.println("size= "+size()+"\ncapacity= "+capacity+"\ntop= "+top().toString());
    }
}
