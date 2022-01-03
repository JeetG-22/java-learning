public class StackLL<T> {

    private class Node<T> {
        private T item;
        private Node<T> next;
    }

    private Node<T> first;

    public boolean isEmpty(){
        return first == null;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
    }
    
    public T pop(){
        if(isEmpty()){ //Prevents null pointer exception when first = null
            return null;
        }
        T item = first.item;
        first = first.next;
        return item;
    }

    public void print(){
        for(Node<T> temp = first; temp != null; temp = temp.next){
            System.out.print(temp.item + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        StackLL<Integer> s1 = new StackLL<Integer>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.print();
        System.out.println(s1.pop());
        s1.print();
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.print();
    }
}
