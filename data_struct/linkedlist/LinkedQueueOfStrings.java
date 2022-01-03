public class LinkedQueueOfStrings {

    private class Node {
        private String item;
        private Node next;
    }

    private Node first, last;

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String item){
        Node newLast = new Node();
        newLast.item = item;
        newLast.next = null;
        if(isEmpty()){
            first = last;
        } else {
            last.next = newLast;
            last = newLast;
        }

    }

    public String dequeue(){
        if(isEmpty()){
            last = null;
            return null;
        }
        String item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args){
        LinkedQueueOfStrings q = new LinkedQueueOfStrings();
        System.out.println(q.dequeue());
        
    }


}
