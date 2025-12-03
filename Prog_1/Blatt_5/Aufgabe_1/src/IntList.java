class IntList {

    private class ListCell{
        int content;
        ListCell next;

        ListCell(int x, ListCell n){
            this.content = x;
            this.next = n;
        }
    }

    public class Iterator{
        private ListCell cursor;

        private Iterator(){this.cursor = head;}

        // returns true if there is another ListCell after the cursor Cell
        public boolean hasNext(){return cursor != null && cursor.next != null;} // avoid exception where cursor == null}

        // returns current ListCell and moves cursor to the next
	public Integer next(){       
		int oldContent = cursor.content;
        	cursor = cursor.next;
        	return oldContent;
        }
    }

    private ListCell head;
    private int size;

    public IntList(){
        head = null;
        size = 0;
    }

    // create new Iterator
    public Iterator iterator(){return new Iterator();}

    // add another ListCell at the start of the list
    public void addFirst(int x){
        head = new ListCell(x, head);
        size++;
    }

    // get content of the first cell
    public Integer getFirst(){
        // get content of empty list
        if (head == null) return null;
        return head.content;   // head only has
    }

    // remove first List object
    public boolean dropFirst(){
        // false if there's nothing to remove
        if (head == null) return false;
        head = head.next;
        size--;
        return true;
    }

    // add another ListCell at the end of the List
    public void addLast(int x){
        ListCell currentCell = head;
        // add to empty list
        if (isEmpty()){
            addFirst(x);
            return;
        }
        // add to non-empty list
        // go to last Cell
        while (currentCell.next != null){
            currentCell = currentCell.next;
        }
        currentCell.next = new ListCell(x, null);
        size++;
    }

    // get content of the last cell
    public Integer getLast(){
        ListCell currentCell = head;
        // return null if list is empty
        if (isEmpty()) return null;
        // go to the last Cell
        while(currentCell.next != null){
            currentCell = currentCell.next;
        }
        return currentCell.content;
    }

    // remove last list object
    public boolean dropLast(){
        ListCell currentCell = head;
        // false if there's nothing to remove
        if (isEmpty()) return false;
        // true if list contains one element, last = first -> dropFirst()
        if (currentCell.next == null){
            dropFirst();
        } else {
            // go to the second last cell
            while (currentCell.next.next != null) {
                currentCell = currentCell.next;
            }
            currentCell.next = null; // delete reference to the last cell
            size--;
        }
        return true;
    }

    // remove all ListCells with content x
    public void remove(int x){
        // delete every Cell with x until the list is empty or up to the first one that doesn't contain x
        while (head != null && head.content == x){
            head = head.next;
            size--;
        }
        ListCell currentCell = head;    // currentCell is either null and the list is empty, or currentCell doesn't contain x
        // go through every Cell
        while (currentCell != null){
            // while there exists another Cell and said Cell contains x, delete that Cell
            while (currentCell.next != null && currentCell.next.content == x){
                currentCell.next = currentCell.next.next;
                size--;
            }
            currentCell = currentCell.next;
        }
    }

    // list contains Cell with int x
    public boolean contains(int x){
        ListCell currentCell = head;
        // go through every Cell in the list
        while (currentCell != null){
            if (currentCell.content == x) return true;
            currentCell = currentCell.next;
        }
        return false;
    }

    // get size of the list
    public int size(){return size;}

    // check if a list is empty
    public boolean isEmpty(){
        return (head == null);
    }

    @Override   // overwrites toString() of superclass Object
    public String toString(){
        // return empty list
        if (isEmpty()) return "[]";
        // go through every Cell in the list, add content of the !previous! cell
        ListCell currentCell = head;
        String temp ="[";
        while (currentCell.next != null){
            temp += currentCell.content + ", ";
            currentCell = currentCell.next;
        }
        // add content of the last cell
        return temp += currentCell.content + "]";
    }
}
